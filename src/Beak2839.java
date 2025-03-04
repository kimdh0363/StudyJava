import java.util.Scanner;

public class Beak2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weightNum = scan.nextInt();
        int count = 0;
        while(weightNum >= 0) {
            if (weightNum % 5 == 0) {
                count += weightNum / 5;
                System.out.println(count);
                return;
            }
            weightNum -= 3;
            count++;
        }
        System.out.println(-1);
    }
}
