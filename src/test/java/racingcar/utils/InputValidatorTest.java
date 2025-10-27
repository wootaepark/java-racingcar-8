package racingcar.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class InputValidatorTest {

    @Test
    void 정상_입력_검증() {
        String input = "pobi, woni, jun";
        String[] result = InputValidator.validateCarNames(input);

        assertArrayEquals(new String[]{"pobi", "woni", "jun"}, result);

    }

    @Test
    void 자동차_이름_앞뒤_공백_제거_검증() {
        String input = "pobi    ,    woni,    jun";
        String[] result = InputValidator.validateCarNames(input);

        assertArrayEquals(new String[]{"pobi", "woni", "jun"}, result);
    }

    @Test
    void 빈_자동차_이름_예외() {
        String input = "pobi,  , jun";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> InputValidator.validateCarNames(input));
        assertEquals("자동차 이름은 비어 있을 수 없습니다.", exception.getMessage());
    }

    @Test
    void 이름_5자_초과_예외() {
        String input = "pobbii, woni, jun";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> InputValidator.validateCarNames(input));
        assertEquals("자동차 이름은 5자 이하만 가능합니다.", exception.getMessage());
    }

    @Test
    void 잘못된_라운드_수_입력_예외() {
        String inputFreq = "3k";
        Exception exception = assertThrows(IllegalArgumentException.class
                , () -> InputValidator.validateInputRound(inputFreq));
        assertEquals("올바르지 않은 형태의 라운드 수 입력입니다.", exception.getMessage());
    }
}
