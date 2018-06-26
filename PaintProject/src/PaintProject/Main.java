package PaintProject;

public class Main {

    public static void main(String[] args) {
        PaintCalculator calc = new PaintCalculator((2007));
        calc.addPaint(new Paint(10, 9.99, 20, "CheapoMax"));
        calc.addPaint(new Paint(11, 17.99, 15, "AverageJoes"));
        calc.addPaint(new Paint(20, 25, 10, "DuluxourousPaints"));
        cheapest(calc);
        leastWaste(calc);
    }

    private static void cheapest(PaintCalculator calc) {
        Paint p = calc.findCheapest();
        System.out.println("cheapest = " + p.toString() + " at £" + calc.calcPrice(p));
    }

    private static void leastWaste(PaintCalculator calc) {
        Paint p = calc.findLeastWaste();
        System.out.println("least waste = " + p.toString() + " with " + calc.calculateWaste(p) + " waste.");
    }
}
