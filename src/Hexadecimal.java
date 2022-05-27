import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("십진수를 입력해주세요 : ");
        int inputNumber = scanner.nextInt();

        // 2. 처리
        String[] hexadecimalNumbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String[] decimalNumbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String result = "";

        if (inputNumber == 0) {
            result = "0";
        }

        if (inputNumber > 0 && inputNumber < 16) {
            result = hexadecimalNumbers[inputNumber - 1];
        }

        if (inputNumber >= 16) {
            int base = 16;
            int remainder = 0;

            for (int i = 0; inputNumber > 0; i += 1) {
                int quotient = inputNumber / base;
                remainder = inputNumber % base;

                if (remainder == 0) {
                    result += "0";
                }

                if (remainder != 0) {
                    result += hexadecimalNumbers[remainder];
                }

                inputNumber = quotient;
            }
        }

        // 3. 출력
        System.out.println("16진수: " + result);
    }
}
