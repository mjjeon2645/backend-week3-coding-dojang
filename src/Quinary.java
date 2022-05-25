// 0. 자연수 n을 0이 될 때까지 5로 나누고, 그 나머지를 거꾸로 읽어 올라가는 것이 5진수 변환 결과이다.
// 1. 유저에게 자연수 n을 입력받는다.
// 2. 입력받은 수를 5로 나누고 나머지를 저장한다.
//    => 1회차 나누기에서 발생한 나머지는 5진수 결과값의 5^0의 자리 수이다.
// 3. 몫을 다시 5로 나누고 발생한 나머지를 원래 나머지에 더한다.
//    => 2회차 나누기에서 발생한 나머지는 5진수 결과값의 5^1의 자리 수이다.
// 4. 남은 몫을 또다시 5로 나누고 발생한 나머지를 원래 나머지에 더한다.
//    => 3회차 나누기에서 발생한 나머지는 5진수 결과값의 5^2의 자리 수이다.
// 5. 위 과정을 반복하여 몫이 0이 될 때까지 나눈 후, 모두 더해진 결과값을 출력한다.

import java.util.Scanner;

public class Quinary {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("Input: ");
        int n = scanner.nextInt();

        // 2. 처리
        int remainder = 0;
        int quotient = n;
        int result = 0;

        // (1) 몫이 0이 될 때까지 반복해서 나눈다. => 반복문인 while 이나 for 사용 가능
        for(int i = 1; quotient / 5 == 0; i += 1) {
            remainder = n % 5;
            quotient = n / 5;
            result += remainder;

            if (i > 1) {
                result *= 10;
            }
        }

        // (2) 나눌 때마다 발생하는 나머지는 더해주되, 매 회차에 맞는 자릿수를 매겨준다(10^(회차-1)를 곱한 뒤 나머지에 더해주면 자릿수 매칭 가능)

        // (3) 몫이 0이 되면 반복을 탈출하고, 결과값을 출력한다.

        // 3. 출력
        System.out.println(result);
    }
}
