package racingcar.model;

public class RacingCar {

    private int step = 0;
    private final String name;

    public RacingCar(String name) {
        this.name = name;
    }

    public void move() {
        step++;
    }


    public int getStep() {
        return step;
    }

    public String getName() {
        return name;
    }

    public String printProgress() {
        return "-".repeat(Math.max(0, step));
    }
}
