package BasicTasks;

public class Main {

    public static void main(String[] args) {
        //task 1
        System.out.println("hello world");

        //task 2
        String msg = "hello world";
        System.out.println(msg);

        //task 3
        printMessage(msg);

        //task 4
        System.out.println(returnMessage());

        //task 5,6,7
        System.out.println(add(1, 0, false));

        //task 8
        iterNums();

        //task 9
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(add(nums[i], 5, true));
        }

        //task 10
        for (i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }

        //task 11
        arrays();

        //task 12
        System.out.println(blackjack(12, 8));

        //task 13
        System.out.println(uniqueSum(3, 3, 4));

        //task 14
        System.out.println(tooHot(100, true));

    }

    //task 3
    private static void printMessage(String message) {
        System.out.println(message);
    }

    //task 4
    private static String returnMessage() {
        return "hello world";
    }

    //task 5,6,7
    private static int add(int num1, int num2, boolean isAdd) {
        int result;
        if (num1 == 0) {
            result = num2;
        } else if (num2 == 0) {
            result = num1;
        } else {
            if (isAdd) {
                result = num1 + num2;
            } else {
                result = num1 * num2;
            }
        }
        return result;
    }

    //task 8
    private static void iterNums() {
        for (int i = 0; i < 10; i++) {
            System.out.println(add(i, 5, true));
        }
    }

    //task 11
    private static void arrays() {
        int nums[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            nums[i] = i;
            System.out.println(nums[i]);
        }
        for (i = 0; i < 10; i++) {
            nums[i] *= 10;
            System.out.println(nums[i]);
        }
    }

    //task 12
    private static int blackjack(int num1, int num2) {
        int result;

        if (num1 <= 21 && num2 <= 21) {
            if (num1 > num2) {
                result = num1;
            } else {
                result = num2;
            }
        } else if (num2 > 21 && num1 <= 21) {
            result = num1;
        } else if (num1 > 21 && num2 <= 21) {
            result = num1;
        } else {
            result = 0;
        }

        return result;
    }

    //task 13
    private static int uniqueSum(int num1, int num2, int num3) {
        int result = 0;

        if (num1 != num2 && num1 != num3) {
            result += num1;
        }
        if (num2 != num1 && num2 != num3) {
            result += num2;
        }
        if (num3 != num1 && num3 != num2) {
            result += num3;
        }

        return result;
    }

    //task 14
    private static boolean tooHot(int temperature, boolean isSummer) {
        boolean isTooHot = false;
        int upper = 90;

        if (isSummer) {
            upper = 100;
        }

        if (temperature >= 60 && temperature <= upper) {
            isTooHot = true;
        }
        return isTooHot;
    }
}

