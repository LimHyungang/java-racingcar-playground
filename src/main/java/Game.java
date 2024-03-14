import java.util.List;

public class Game {
    InputOutput io;
    GameResult result;

    Game() {
        this.io = new InputOutput();
        this.result = new GameResult();
    }

    public void start() throws Exception {
        List<Car> cars = io.inputCars();
        int cnt = io.inputCnt();
        play(cars, cnt);
    }

    public void play(List<Car> cars, int cnt) {
        for(int i = 0; i < cnt; i++) {
            race(cars);
        }
        io.printMsg(result.gameResult(cars));
    }

    public void race(List<Car> cars) {
        for(Car car : cars) {
            car.accelerate(car.getRandomSpeed());
        }
        this.result.addRaceResult(cars);
    }
}
