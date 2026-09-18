package racingcar.car;

public class Car {

    private final String name;
    private int position;
    private static final int MAX_NAME_LENGTH = 5;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
        }
        if(name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }
}

