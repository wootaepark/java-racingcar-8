package racingcar.service;

import java.util.List;
import racingcar.model.RacingCar;

public interface RacingCarService {
    // 기능

    // RacingCar 객체 생성
    List<RacingCar> createRacingCar(List<String> racingCarList);


}
