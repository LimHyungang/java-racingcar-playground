import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car = null;

    @BeforeEach
    public void init() {
        try{
            car = new Car("myCar", 1);
        }catch(Exception e) {
            // do nothing
        }
    }

    @Test
    public void getRandomSpeed() throws Exception {
        int speed = this.car.getRandomSpeed();
        assertThat(speed).isBetween(0, 9);
    }

    @Test
    public void nowLocationTest() {
        // 현재 위치값
        String locStr = this.car.nowLocStr();
        assertThat(locStr).isEqualTo("-");
    }

    @Test
    public void accelerateTest() throws Exception {
        // 가속 성공 시 위치값 증가
        this.car.accelerate(5);
        assertThat(this.car.nowLocStr()).isEqualTo(2);
    }
}
