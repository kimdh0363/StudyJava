import java.util.Scanner;

public class Baek2798 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int cardNumber = scan.nextInt();
        int goalNumber = scan.nextInt();
        int maxValue = 0;
        int sumValue = 0;
        int[] cardValue = new int[cardNumber];
        for (int i = 0; i < cardNumber; i++) {
            cardValue[i] = scan.nextInt();
        }
        for (int i = 0; i < cardNumber; i++) {
            for (int j = i+1; j < cardNumber; j++) {
                for (int k = j+1; k < cardNumber; k++) {
                    sumValue = cardValue[i] + cardValue[j] + cardValue[k];
                    if (sumValue <= goalNumber && sumValue > maxValue) {
                        maxValue = sumValue;
                    }
                }
            }
        }
        System.out.println(maxValue);
    }
}
