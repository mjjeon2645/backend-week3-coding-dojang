import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("n: ");
        int n = scanner.nextInt();

        // 2. 처리
        String result = "";

        if (n == 1 || n == 2) {
            result = "소수 아님";
        }

        if (n != 1 || n != 2) {
            for (int i = 2; i < n; i += 1) {
                if (n % i == 0) {
                    result = "소수 아님";
                    break;
                }

                if (n % i != 0) {
                    result = "소수";
                    break;
                }
            }
        }

        // 3. 출력
        System.out.println(result);
    }
}
