package racingcar.controller;

import racingcar.car.Car;
import racingcar.car.Cars;
import racingcar.parse.ParseCarName;
import racingcar.parse.ParseRound;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final ParseCarName parseCarName = new ParseCarName();
    private final ParseRound parseRound = new ParseRound();

    public void start(){

        outputView.firstOutput();
        String[] carNames = parseCarName.parse(inputView.readInput());

        outputView.secondOutPut();
        int roundNum = parseRound.parseRound(inputView.readRound());

        List<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }

        Cars cars = new Cars(carList);

        cars.getCarList();
    }
}
