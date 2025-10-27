package racingcar.controller;

import java.util.List;
import racingcar.model.RacingCar;
import racingcar.service.RacingCarService;
import racingcar.service.RacingCarServiceImpl;
import racingcar.service.RacingGameEndService;
import racingcar.service.RacingGameEndServiceImpl;
import racingcar.service.RacingGameService;
import racingcar.service.RacingGameServiceImpl;
import racingcar.view.InputView;

public class RacingCarController {

    private final RacingGameService racingGameService = new RacingGameServiceImpl();
    private final RacingCarService racingCarService = new RacingCarServiceImpl();
    private final RacingGameEndService racingGameEndService = new RacingGameEndServiceImpl();

    public void run() {

        // 입력
        List<String> carNames = InputView.getCarNames();
        int round = InputView.getFreq();
        System.out.println("실행 결과");

        // 객체 생성

        // TODO : 실행 로직 수행
        List<RacingCar> racingCars = racingCarService.createRacingCar(carNames);
        racingGameService.playGame(racingCars, round);

        // 출력
        System.out.print("최종 우승자 : " + racingGameEndService.endGame(racingCars));


    }
}
