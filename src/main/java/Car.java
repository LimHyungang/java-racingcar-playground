import java.util.Random;

public class Car {

    static Random rand;
    CarName name;
    CarLoc loc;

    public Car(String name, int loc) throws Exception {
        if(rand == null) {
            rand = new Random();
        }
        this.name = new CarName(name);
        this.loc = new CarLoc(loc);
    }

    public int getRandomSpeed() {
        return rand.nextInt(9);
    }

    public String nowCarName() {
        return name.nowNameValue();
    }

    public String nowLocStr() {
        // CarLoc 객체에게 loc 값을 물어본다?
        int nowLoc = this.loc.nowLocValue();
        String locStr = "";
        for(int i = 0; i < nowLoc; i++) {
            locStr += "-";
        }
        return locStr;
    }

    public int nowLocInt() {
        return this.loc.nowLocValue();
    }

    public void accelerate(int speed) {
        if(speed >= 4) {
            this.loc.moveForward();
        }
    }
}
