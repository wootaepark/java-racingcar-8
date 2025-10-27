package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.model.RacingCar;

class RacingGameServiceImplTest {

    private RacingGameServiceImpl racingGameService;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        racingGameService = new RacingGameServiceImpl();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void 게임_진행_출력_테스트() {
        RacingCar car1 = new RacingCar("pobi");
        RacingCar car2 = new RacingCar("woni");
        RacingCar car3 = new RacingCar("jun");

        List<RacingCar> cars = List.of(car1, car2, car3);

        // 랜덤으로 이렇게 이동했다고 가정
        car1.move();
        car3.move();

        racingGameService.playGame(cars, 1);

        String output = outContent.toString();

        assertThat(output).contains("pobi : -");
        assertThat(output).contains("woni : ");
        assertThat(output).contains("jun : -");

    }
}
