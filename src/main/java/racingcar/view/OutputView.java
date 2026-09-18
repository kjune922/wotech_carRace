package racingcar.view;

import racingcar.car.Car;

import java.util.List;

public class OutputView {

    public void printCarNameRequest(){
        System.out.println("경주할 자동차 이름을 입력해주세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printRoundNumRequest(){
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public void printEachRoundResultRequest() {
        System.out.println("실행 결과");
    }

    public void printEachRoundResult(List<Car> carList) {
        for (Car car : carList) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < car.getPosition(); i++) {
                sb.append("-");
            }
            System.out.println(car.getName() + " : " + sb);
        }
        System.out.println();
    }

    public void printWinner(String name){
        System.out.println("최종 우승자 : " + name);
    }
}
