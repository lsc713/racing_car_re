package src.main.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ResultView resultView = new ResultView();
        RacingCar racingCar = new RacingCar("qwe,asd,zxc",5);
        for (int i = 0; i < 5; i++) {
            List<Car> race = racingCar.race();
            resultView.printRace(race);
        }
        List<Car> winner = racingCar.findWinner();

        resultView.printWinners(winner);
    }
}
