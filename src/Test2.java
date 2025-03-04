import java.util.Objects;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                score++;
            }
        }
        if (score == 0){
            System.out.println(score);
        } else {
            System.out.println(score + 1);
        }
    }
}
