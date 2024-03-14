import java.util.ArrayList;
import java.util.List;

public class GameResult {

    private List<RaceResult> races;
    private StringBuilder sb;
    private List<String> winners;

    GameResult() {
        this.races = new ArrayList<RaceResult>();
        this.winners = new ArrayList<String>();
        this.sb = new StringBuilder("실행 결과\n");
    }

    public void addRaceResult(List<Car> cars) {
        RaceResult raceResult = new RaceResult(cars);
        sb.append(raceResult.raceResult()).append("\n");
        races.add(raceResult);  // 저장하긴 하는데 딱히 쓸 데는 없을 듯? 이미 sb.append() 다 했잖아..
    }

    public String gameResult(List<Car> cars) {
        win(cars);  // 우승자 구하기
        makeWinnersStr();
        return sb.toString();
    }

    public void win(List<Car> cars) {
        int maxLoc = Integer.MIN_VALUE;
        for(Car car : cars) {
            int nowLoc = car.nowLocInt();
            if(nowLoc == maxLoc) {
                winners.add(car.nowCarName());
            }
            if(nowLoc > maxLoc) {
                maxLoc = nowLoc;
                winners.clear();
                winners.add(car.nowCarName());
            }
        }
    }

    public void makeWinnersStr() {
        for(int i = 0; i < winners.size(); i++) {
            sb.append(winners.get(i));
            if(i != winners.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("가 최종 우승했습니다.");
    }
}
