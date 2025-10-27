package racingcar.utils;

public class InputValidator {

    public static String[] validateCarNames(String input) {
        String[] names = input.split(",");
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
            if (names[i].isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
            }

            if (names[i].length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
        return names;
    }

    public static void validateInputRound(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("올바르지 않은 형태의 라운드 수 입력입니다.");
        }
    }
}
