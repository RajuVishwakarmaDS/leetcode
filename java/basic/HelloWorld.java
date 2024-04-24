package leet.code.java.basic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("raju");
        System.out.println("achal");
        System.out.print("rabina\n");
        System.out.print("pravin\n");
        System.out.println("raju\tsharma");
        int num = 5;
        int num2 = 10;
        System.out.printf("number is: %d\n", num);
        System.out.printf("numbers are %d and %d\n", num, num2);
        System.out.println("numbers are %d and %d".formatted(num, num2));

        int a = 5;
        double d = 5.6;
        float f = 5.65566745f;
        char ch = 'a';
        boolean b = true;
        String str = "raju"; // string is not a data type
        System.out.printf("%.2f\n", f);
        int num3 = (int) f;
        int num4 = (int) 5.767445;

        /*
        1. variable name should start with a character
        eg. int num, int 5d -- invalid
        2. number and _ can be included after first character
        eg. int my_number, better --> myNumber
        3. camelcase
        4. meaningful variable num
        eg. int number, int numerator
         */

        // ascii conversion
        // a -> 97
        // A -> 65
        System.out.println((int) ch);

        char c = 'D';
        if ((int) c >= 97 && (int) c <= 97 + 26) {
            System.out.println("small alpha");
        } else {
            System.out.println("large");
        }
    }
}
