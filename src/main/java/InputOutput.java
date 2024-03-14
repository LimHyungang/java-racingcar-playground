import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutput {
    static final Scanner scan = new Scanner(System.in);

    public void printInputCarsMsg() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void printInputCntMsg() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printMsg(String msg) {
        System.out.println(msg);
    }


    public List<Car> inputCars() throws Exception {
        printInputCarsMsg();

        List<Car> list = new ArrayList<Car>();
        String[] arr = scan.nextLine().split(",");
        for(String str : arr) {
            list.add(new Car(str, 1));
        }

        return list;
    }

    public int inputCnt() {
        printInputCntMsg();
        return scan.nextInt();
    }
}
