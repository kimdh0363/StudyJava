class Test1 {
    int num1;
    String str1;
    double num2;
    Test1(int num1, String str1, double num2) {
        this.num1 = num1;
        this.str1 = str1;
        this.num2 = num2;
        System.out.println("constructor called");

    }
    Test1(){
        this(10, "d", 11.56);
    }
}

class MainTest {
    public static void main(String[] args) {
        Test1 test = new Test1();

    }
}
