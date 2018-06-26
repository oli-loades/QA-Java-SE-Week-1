package PaintProject;

import java.util.ArrayList;
import java.util.List;

public class PaintCalculator {
    private int requiredCoverage;
    private List<Paint> paints;

    protected PaintCalculator(int requiredCoverage) {
        this.requiredCoverage = requiredCoverage;
        paints = new ArrayList<>();
    }

    protected int getRequiredCoverage() {
        return requiredCoverage;
    }

    protected void addPaint(Paint p) {
        paints.add(p);
    }

    protected void setRequiredCoverage(int requiredCoverage) {
        this.requiredCoverage = requiredCoverage;
    }

    protected int minNumCans(Paint p) {
        int numCans = 0;

        numCans = requiredCoverage / p.getCoverage();
        if (requiredCoverage % p.getCoverage() != 0) {
            numCans++;
        }
        //System.out.println(p.getName() + " - " + numCans);
        return numCans;
    }

    protected Paint findCheapest() {
        Paint cheapest = null;
        if (!isEmpty()) {
            cheapest = paints.get(0);
            double cheapestPrice = cheapest.getPrice() * minNumCans(cheapest);
            for (Paint p : paints) {
                double currentPrice = p.getPrice() * (minNumCans(p));
                if (cheapestPrice > currentPrice) {
                    cheapestPrice = currentPrice;
                    cheapest = p;
                }
            }
        }
        return cheapest;
    }

    protected Paint findLeastWaste() {
        Paint leastWaste = null;
        if (!isEmpty()) {
            leastWaste = paints.get(0);
            int currentWaste =  (leastWaste.getCoverage()* minNumCans(leastWaste)) - requiredCoverage;
            for (Paint p : paints) {
                int waste = (p.getCoverage()*minNumCans(p)) - requiredCoverage;
                if(currentWaste>waste){
                    currentWaste = waste;
                    leastWaste = p;
                }
            }
        }
        return leastWaste;
    }

    protected boolean isEmpty() {
        return paints.isEmpty();
    }

    protected int calculateWaste(Paint p){

        return  (p.getCoverage()*minNumCans(p)) - requiredCoverage;
    }

    protected double calcPrice(Paint p){
       return p.getPrice() * (minNumCans(p));
    }
}
