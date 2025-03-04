import java.util.Scanner;

public class Baek24723 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int resultNum = 1;
        for (int i = 0; i < inputNum; i++) {
            resultNum *= 2;
        }
        System.out.println(resultNum);
    }
}
