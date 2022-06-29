package composition.core;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("Mac Pro", "Apple", "240", dimensions);
        

        Monitor theMonitor = new Monitor("Studio Display", "Apple", 27, new Resolution(5120, 2880));

        Motherboard theMotherboard = new Motherboard("Mac Pro Motherboard", "Apple", 4, 6, "v3.0");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        // thePC.getMotherboard().loadProgram("MacOS Monterey");
        // thePC.getTheCase().pressPowerButton();

        thePC.powerUp();
    }
}
