package racingcar.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = List.copyOf(carList);
    }

    public List<Car> getCarList() {
        return carList;
    }
    public String calculateWinner(List<Car> carList){
        int maxPosition = findMaxPosition(carList);

        List<String> winners = new ArrayList<>();
        for (Car car : carList) {
            if(car.getPosition() == maxPosition){
                winners.add(car.getName());
            }
        }
        return String.join(", ",winners);
    }
    private int findMaxPosition(List<Car> carList) {
        int maxPosition = 0;

        for (Car car : carList) {
            maxPosition = Math.max(car.getPosition(), maxPosition);
        }
        return maxPosition;
    }
}
