package Dogs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter place");
        int place = sc.nextInt();

        printPlaces(place);
    }

    public static void printPlaces(int place) {
        for (int i = 1; i <= 100; i++) {
            if (i != place) {
                if (i >= 11 && i <= 13) {
                    System.out.println(i + "th");
                } else if (lastDigit(i) == 1) {
                    System.out.println(i + "st");
                } else if (lastDigit(i) == 2) {
                    System.out.println(i + "nd");
                } else if (lastDigit(i) == 3) {
                    System.out.println(i + "rd");
                } else {
                    System.out.println(i + "th");
                }
            }
        }
    }


    public static int lastDigit(int num) {
        String temp = Integer.toString(num);
        int last = Integer.parseInt(temp.substring(temp.length() - 1));
        return last;
    }
}
