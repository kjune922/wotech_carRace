package racingcar.service;

import racingcar.car.Car;
import racingcar.car.Cars;
import racingcar.random.RandomNumber;
import racingcar.view.OutputView;

import java.util.List;

public class GameService {

    private final RandomNumber randomNumber = new RandomNumber();
    private final OutputView outputView = new OutputView();

    public List<Car> moveCars(Cars cars) {
        List<Car> carList = cars.getCarList();
        for (Car car : carList) {
            int num = randomNumber.createRandomNumber();
            if(num >= 4){
                car.move();
            }
        }
        return carList;
    }
}
