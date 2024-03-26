import java.util.Arrays;
import java.util.Scanner;

public class c0326_11501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < tc; i++) {
            int N = sc.nextInt(); // 날짜의 수
            int[] fund = new int[N]; // 각 날짜별 주식 가격

            for (int j = 0; j < N; j++) {
                fund[j] = sc.nextInt(); // 주식 가격 입력
            }

            long result = 0; // 최대 이익
            int maxPrice = fund[N - 1]; // 뒤에서부터의 최대 주식 가격

            for (int j = N - 2; j >= 0; j--) { // 뒤에서부터 앞으로 반복
                if (fund[j] > maxPrice) { // 현재 주식 가격이 최대 가격보다 크면, 최대 가격 갱신
                    maxPrice = fund[j];
                } else { // 현재 주식 가격이 최대 가격보다 작으면, 차이만큼 이익 취함
                    result += (maxPrice - fund[j]);
                }
            }

            System.out.println(result);
        }

        sc.close();
    }

}
