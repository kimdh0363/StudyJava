import java.util.Scanner;

public class Baek2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        int num = 0;
        int resultNum = 0;
        for (int i = 0; i < inputNum; i++) {
            num = i;
            int sumValue = 0;
            while (num > 0) {
                sumValue += num % 10;
                num /= 10;
            }
            if (sumValue + i == inputNum) {
                resultNum = i;
                break;
            }
        }
        System.out.println(resultNum);
    }
}

