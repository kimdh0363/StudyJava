import java.util.Arrays;
import java.util.Scanner;

public class Baek1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNum = scan.nextInt();
        int[] valueArr = new int[countNum];
        for (int i = 0; i < valueArr.length; i++) {
            valueArr[i] = scan.nextInt();
        }
        Arrays.sort(valueArr);
        System.out.println(valueArr[0] * valueArr[valueArr.length - 1]);
    }
}

