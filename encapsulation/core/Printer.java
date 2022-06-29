package encapsulation.core;

public class Printer {
    private int tonerLevel;
    private int numPagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numPagePrinted, boolean duplex) {
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }

        if (numPagePrinted < 0) {
            this.numPagePrinted = 0;
        } else {
            this.numPagePrinted = numPagePrinted;
        }
        
        this.duplex = duplex;
    }

    public void refillToner(int amount) {
        if (tonerLevel < 100) {
            this.tonerLevel += amount;
            if (this.tonerLevel > 100) {
                this.tonerLevel = 100; //refilled to 100%
            }
            System.out.printf("Toner refilled to %d%%.\n", this.tonerLevel);
        } else {
            System.out.println("Toner is already at 100%.");
        }
    }

    public void print(int copies) {
        if (duplex) {
            copies = copies * 2;
        }
        this.tonerLevel -= copies;
        this.numPagePrinted += copies;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPagePrinted() {
        return numPagePrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
    
}
