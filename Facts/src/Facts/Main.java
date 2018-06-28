package Facts;

public class Main {

    public static void main(String[] args) {


        int val = 120;
        int result = revFactorial(val);

        if (isFactorial(val, result)) {
            System.out.println(result);
        } else {
            System.out.println(" not factorial");
        }

    }

    public static int revFactorial(int val) {

        int divisor = 1;
        int prevResult;

        do {
            divisor++;
            prevResult = val;
            val = val / divisor;
            System.out.println(val + " = " + prevResult + " / " + divisor);
        } while (val != 1);

        return divisor;
    }

    public static boolean isFactorial(int val, int divisor) {
        return val % divisor == 0;
    }

}
