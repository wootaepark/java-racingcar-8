package racingcar.service;

import java.util.List;
import racingcar.model.RacingCar;

public interface RacingGameService {
    // 게임 시작
    void playGame(List<RacingCar> racingCars, int rounds);


}
