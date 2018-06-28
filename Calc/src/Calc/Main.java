package Calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c,d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        check(a,b,c);
        check(a,b,d);
        check(a,c,d);
        check(b,c,d);
    }

    public static void check(int a, int b, int c){
        if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
            System.out.println(c + " / " + a + " = " + b);
            System.out.println(c + " / " + b + " = " + a);
        } else if (c * b == a) {
            System.out.println(c + " * " + b + " = " + a);
            System.out.println(a + " / " + b + " = " + c);
            System.out.println(a + " / " + c + " = " + b);
        } else if (a * c == b) {
            System.out.println(a + " * " + c + " = " + b);
            System.out.println(c + " / " + b + " = " + a);
            System.out.println(c + " / " + a + " = " + b);
        } else if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
            System.out.println(c + " - " + a + " = " + b);
            System.out.println(c + " - " + b + " = " + a);
        } else if (c + b == a) {
            System.out.println(c + " + " + b + " = " + a);
            System.out.println(a + " - " + b + " = " + c);
            System.out.println(a + " - " + c + " = " + b);
        } else if (a + c == b) {
            System.out.println(a + " + " + c + " = " + b);
            System.out.println(c + " - " + b + " = " + a);
            System.out.println(c + " - " + a + " = " + b);
        } else {
            System.out.println("error - no match");
        }
    }


}
