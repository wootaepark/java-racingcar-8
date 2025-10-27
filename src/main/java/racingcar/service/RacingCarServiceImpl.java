package racingcar.service;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.RacingCar;

public class RacingCarServiceImpl implements RacingCarService {

    @Override
    public List<RacingCar> createRacingCar(List<String> carNames) {
        return carNames.stream()
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }


}
