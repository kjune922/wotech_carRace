package racingcar.service;

import racingcar.car.Car;
import racingcar.car.Cars;
import racingcar.random.RandomNumber;
import racingcar.view.OutputView;

import java.util.List;

public class GameService {

    private final Cars cars = new Cars();
    private final RandomNumber randomNumber = new RandomNumber();
    private final OutputView outputView = new OutputView();

    public void eachRound(List<Car> carList, int roundNum){
        for (int i = 0; i < roundNum; i++) {
            for (Car car : carList) {
                int num = randomNumber.createRandomNumber();
                if(num >= 4){
                    car.move();
                }
            }
            outputView.printEachRoundResult(carList);
        }
    }
}
