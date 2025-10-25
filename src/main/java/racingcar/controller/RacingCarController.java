package racingcar.controller;

import racingcar.view.InputView;

public class RacingCarController {

    public static void run() {

        // 입력
        String[] carNames = InputView.getCarNames();
        int freq = InputView.getFreq();

        // TODO : 실행 로직 수행
        // input : carNames, freq
        // output : racing_result_map (random count), winner

        // 출력
        // OutputView.printProgress(racing_result_map);
        // OutputView.getResult(winner);

        // test 출력
        for (String carName : carNames) {
            System.out.println(carName);
        }
        System.out.println("시도 횟수" + freq);
    }
}
