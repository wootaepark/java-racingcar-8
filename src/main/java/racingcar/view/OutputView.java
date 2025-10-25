package racingcar.view;

import java.util.Map;

public class OutputView {

    public static void printProgress(Map<String, Integer> cars) {
        for (Map.Entry<String, Integer> car : cars.entrySet()) {
            System.out.println(car.getKey() + ": " + car.getValue());
        }
    }

    public static void getResult(String value) {
        System.out.println("최종 우승자 : " + value);
    }
}
