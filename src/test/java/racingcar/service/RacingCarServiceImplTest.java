package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.model.RacingCar;

class RacingCarServiceImplTest {

    private static final int INITIAL_STEPS = 0;
    private final RacingCarService racingCarService = new RacingCarServiceImpl();


    @Test
    void 자동차_객체_생성() {
        List<String> carNames = List.of("pobi", "woni", "jun");

        List<RacingCar> racingCars = racingCarService.createRacingCar(carNames);

        // 리스트 크기 확인
        assertThat(racingCars).hasSize(carNames.size());

        // 각 객체의 이름 확인
        for (int i = 0; i < carNames.size(); i++) {
            // 이름과 초기 step 변수 확인
            assertThat(racingCars.get(i).getName()).isEqualTo(carNames.get(i));
            assertThat(racingCars.get(i).getStep()).isEqualTo(INITIAL_STEPS);
        }

    }
}
