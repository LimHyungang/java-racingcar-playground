import java.util.List;

public class RaceResult {

    private StringBuilder sb;

    RaceResult(List<Car> cars) {
        sb = new StringBuilder();
        for(Car car : cars) {
            sb.append(car.nowCarName())
                    .append(" : ")
                    .append(car.nowLocStr())
                    .append("\n");
        }
    }

    public String raceResult() {
        return sb.toString();
    }
}
