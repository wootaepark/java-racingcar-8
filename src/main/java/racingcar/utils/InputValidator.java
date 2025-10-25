package racingcar.utils;

public class InputValidator {

    public static String[] validateCarNames(String input) {
        String[] names = input.split(",");
        for (String name : names) {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
            }

            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
        return names;
    }
}
