public class CarLoc {

    private final int START_LOC = 1;
    private int loc;
    public CarLoc(int loc) throws Exception {
        if(loc != START_LOC) {
            System.out.println("loc is " + loc);
            throw new Exception("시작 위치는 " + START_LOC + "이어야 합니다.");
        }
        this.loc = loc;
    }

    public int nowLocValue() {
        return this.loc;
    }

    public void moveForward() {
        this.loc += 1;
    }
}
