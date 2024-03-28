import java.util.Scanner;

public class c13305_0328 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 도시의 개수
        long[] city = new long[N - 1]; // 도시 간 거리 배열
        long[] cost = new long[N]; // 가격 배열

        for (int i = 0; i < N - 1; i++) {
            city[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextLong();
        }

        long result = 0;
        long oilCost = cost[0]; // 시작 칸의 기름값으로 시작
        long distance = 0; // 현재 기름값으로 이동할 수 있는 거리

        for (int i = 0; i < N - 1; i++) {
            distance += city[i]; // 이동 거리 누적
            if (oilCost > cost[i + 1]) { // 다음 도시의 기름값이 더 싸면, 현재까지의 거리만큼 기름을 충전
                result += oilCost * distance;
                oilCost = cost[i + 1]; // 기름값 갱신
                distance = 0; // 거리 초기화
            }
            // 다음 도시의 기름값이 더 비싸면 계속 이동
        }

        // 마지막 도시에 도착했을 때 충전
        result += oilCost * distance;

        System.out.println(result);
    }
}