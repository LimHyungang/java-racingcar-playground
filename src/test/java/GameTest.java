import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    Game game;
    List<Car> cars;

    @BeforeEach
    public void init() {
        try {
            game = new Game();
            cars = new ArrayList<Car>();
            cars.add(new Car("car1", 1));
            cars.add(new Car("car2", 1));
        }catch(Exception e) {
            // do nothing
        }
    }

    @Test
    public void raceTest() {
        // return void 는 어떻게 테스트하지...
        game.race(this.cars);
    }

}
