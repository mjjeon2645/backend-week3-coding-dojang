import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("로마 숫자 : ");
        String romanNumber = scanner.nextLine();

        // 2. 처리
        int result = 0;

        String[] romanNumberTable = new String[] { "I", "V", "X", "L", "C", "D", "M" };
        int[] arabianNumberTable = new int[] {1, 5, 10, 50, 100, 500, 1000};

        for (int i = 0; i < romanNumberTable.length; i += 1) {

        }

        // 3. 출력
        System.out.print("아라비아 숫자 : " + result);
    }
}
