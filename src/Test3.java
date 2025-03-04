import java.util.Scanner;

class Number {
    String str;
    char[] getValue = new char[3];
    String ChangeToChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            getValue[i] = str.charAt(str.length()-1-i);
        }
        this.str = new String(getValue);
        return this.str;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputNum1 = scan.next();
        String inputNum2 = scan.next();
        int numInt1 = 0;
        int numInt2 = 0;
        Number number1 = new Number();
        Number number2 = new Number();
        numInt1 = Integer.parseInt(number1.ChangeToChar(inputNum1));
        numInt2 = Integer.parseInt(number2.ChangeToChar(inputNum2));
        if (numInt1 > numInt2) {
            System.out.println(numInt1);
        } else {
            System.out.println(numInt2);
        }
    }
}
