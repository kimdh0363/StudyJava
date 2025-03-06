import java.util.Scanner;

public class Baek10872 {
    public static int factorial(int num) {
        int result = 0;
        if (num == 0) {
            return 1;
        }
        result = num * factorial(num-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }
}
