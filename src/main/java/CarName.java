public class CarName {

    private final int SIZE = 5;
    private String name;
    public CarName(String name) throws Exception {
        if(name.length() > SIZE) {
            throw new Exception("자동차 이름은 " + SIZE + "자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    public String nowNameValue() {
        return this.name;
    }
}
