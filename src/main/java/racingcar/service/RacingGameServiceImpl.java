package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.model.RacingCar;

public class RacingGameServiceImpl implements RacingGameService {


    @Override
    public void playGame(List<RacingCar> racingCars, int rounds) {
        for (int i = 0; i < rounds; i++) {
            startRound(racingCars);
            printProgress(racingCars);
            System.out.println();
        }
    }

    private void startRound(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                racingCar.move();
            }
        }
    }


    private void printProgress(List<RacingCar> racingCarList) {
        for (RacingCar racingCar : racingCarList) {
            System.out.println(racingCar.getName() + " : " + racingCar.printProgress());
        }
    }


}
