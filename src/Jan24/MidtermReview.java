package Jan24;

public class MidtermReview {
    public static void main(String[] args) {
        //int a = 3;
        //double x = 7.4;
        //int y = x;
        //double b = a;
//        double x = (double) (13/8);
//        System.out.println(x);
//        double y = 13.0/8;
//        System.out.println(y);
//        double z = 13/8.0;
//        System.out.println(z);
//        System.out.println(13 - (((3 * 6) / 4) % 3));
//        int num = 22;
//        if (num > 0)
//            if (num % 5 == 0)
//                System.out.println(num);
//            else System.out.println(num + " is negative");
//        for (int i = 0; i <= 10; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " " + (int)Math.pow(i, 2) + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 1; i <= 5; i ++) {
//            for (int j = 1; j <= i; j ++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        Free Response Challenge: Self-Divisor
//        This is a problem from the 2007 AP Exam. In this problem set, points are allocated for accurate syntax for
//        the method header, a precise solution in the method body, and a valid return statement. For this problem set,
//        you must include a comment for every line or section of code to thoroughly explain how your code functions.
//
//                Concept
//        “Self-Divisor”: A number is a “self-divisor” if it is divisible by each of its digits. For example, 128 is
//        a “self-divisor” because it is divisible by 1, 2, and 8. However, 64 is not a self-divisor, since it is not
//        divisible by 6.
//
//                * IMPORTANT NOTE*: 0 is not considered a divisor of anything, so any number including the digit 0 is
//                * NOT a self-divisor.
//
//                There are infinitely many self-divisors.
//  Task:
//        Write a method called isSelfDivisor that would function in main (this means it would be a static method).
//        It should take in a positive integer parameter called “test” and return a boolean. Obviously, the boolean
//        should be true if the number is a self-divisor and false if the number is not a self-divisor.
//
//                Paste your answer in this document.
        System.out.println(isSelfDivisor(27));

    }
    public static boolean isSelfDivisor(int test) {
        int[] digits = new int[String.valueOf(test).length() + 1];
        int n = test;
        int counter = 0;
        while (n != 0) {
            digits[counter] = test % 10;
            n /= 10;
            counter ++;
        }

        for (int i = 0; i < digits.length - 1; i++) {
            if (test % digits[i] != 0) return false;
        }
        return true;
    }
}
