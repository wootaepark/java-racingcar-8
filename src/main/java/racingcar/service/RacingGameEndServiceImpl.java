package racingcar.service;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.RacingCar;

public class RacingGameEndServiceImpl implements RacingGameEndService {

    public String endGame(List<RacingCar> racingCars) {
        int maxStep = findMaxStep(racingCars);
        List<String> winners = findWinnersByStep(racingCars, maxStep);
        return buildWinnersString(winners);
    }


    private int findMaxStep(List<RacingCar> racingCars) {
        return racingCars.stream()
                .mapToInt(RacingCar::getStep)
                .max()
                .orElse(0);
    }


    private List<String> findWinnersByStep(List<RacingCar> racingCars, int maxStep) {
        return racingCars.stream()
                .filter(car -> car.getStep() == maxStep)
                .map(RacingCar::getName)
                .collect(Collectors.toList());
    }

    private String buildWinnersString(List<String> winners) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < winners.size(); i++) {
            stringBuilder.append(winners.get(i));
            if (i < winners.size() - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

}
