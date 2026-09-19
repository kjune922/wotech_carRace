package racingcar.controller;

import racingcar.car.Car;
import racingcar.car.Cars;
import racingcar.parse.ParseCarName;
import racingcar.parse.ParseRound;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final ParseCarName parseCarName = new ParseCarName();
    private final ParseRound parseRound = new ParseRound();
    private final GameService gameService = new GameService();

    public void start(){

        outputView.printCarNameRequest();
        String[] carNames = parseCarName.parse(inputView.readInput());

        outputView.printRoundNumRequest();
        int roundNum = parseRound.parseRound(inputView.readRound());

        List<Car> carList = new ArrayList<>();

        for (String carName : carNames) {
            Car car = new Car(carName);
            carList.add(car);
        }
        Cars cars = new Cars(carList);


        outputView.printEachRoundResultRequest();

        for (int i = 0; i < roundNum; i++) {
            outputView.printEachRoundResult(gameService.moveCars(cars));
        }

        outputView.printWinner(cars.calculateWinner());
    }

}
