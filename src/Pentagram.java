import java.util.Scanner;

public class Pentagram {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. input
        System.out.print("Input: ");
        int n = scanner.nextInt();

        // 2. process (몫이 0이 될 때까지 n을 5로 나눈 나머지를 거꾸로 읽어올라가면 pentaNumber가 됨)
        String[] remainders = new String[];

        while(n > 0) {
            n /= 5;
            remainders[] = Integer.toString(n % 5);
        }

        // 3. output
        System.out.println("5 진수: " + remainders);
    }
}
