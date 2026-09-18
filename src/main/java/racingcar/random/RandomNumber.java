package racingcar.random;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    public int createRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }
}
