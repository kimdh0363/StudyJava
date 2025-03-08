import java.util.Scanner;

public class Baek10870 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int indexNum = scan.nextInt();
        System.out.println(Fibonacci.fibonacci(indexNum));
    }
}

class Fibonacci {
    static int fibonacci(int index) {
        if (index == 1) {
            return 1;
        }else if (index == 0) {
            return 0;
        }

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
