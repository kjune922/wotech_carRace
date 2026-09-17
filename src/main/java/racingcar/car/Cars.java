package racingcar.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> carList = new ArrayList<>();

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
