package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.model.RacingCar;

class RacingGameEndServiceImplTest {

    private RacingGameEndServiceImpl racingGameEndService;

    @BeforeEach
    void setUp() {
        racingGameEndService = new RacingGameEndServiceImpl();
    }

    @Test
    void 단일_우승자_테스트() {
        RacingCar car1 = new RacingCar("pobi");
        RacingCar car2 = new RacingCar("woni");
        RacingCar car3 = new RacingCar("jun");

        // 랜덤하게 car1 만 움직였다고 가정
        car1.move();

        List<RacingCar> cars = List.of(car1, car2, car3);
        String winners = racingGameEndService.endGame(cars);

        assertThat(winners).isEqualTo("pobi");


    }

    @Test
    void 복수_우승자_테스트() {
        RacingCar car1 = new RacingCar("pobi");
        RacingCar car2 = new RacingCar("woni");
        RacingCar car3 = new RacingCar("jun");

        // car1, car3 가 동일한 거리를 움직였다고 가정

        car1.move();
        car3.move();

        List<RacingCar> cars = List.of(car1, car2, car3);
        String winners = racingGameEndService.endGame(cars);

        assertThat(winners).isEqualTo("pobi,jun");

    }

    @Test
    void 이동_없는_자동차_테스트() {
        RacingCar car1 = new RacingCar("pobi");
        RacingCar car2 = new RacingCar("woni");
        RacingCar car3 = new RacingCar("jun");

        // move() 메서드 없이 모두 움직이지 않은 경우를 가정
        List<RacingCar> cars = List.of(car1, car2, car3);

        String winners = racingGameEndService.endGame(cars);

        assertThat(winners).isEqualTo("pobi,woni,jun");
    }
}
