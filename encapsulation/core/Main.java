package encapsulation.core;

import javax.swing.SpringLayout;

public class Main {
    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.printf("% health points remaining. \n", player.healthRemaining());

        // Printer printer = new Printer(26, 0, true);
        // System.out.println(printer.getTonerLevel());
        // printer.refillToner(80);
        // printer.refillToner(10);
        // printer.print(5);
        // System.out.println(printer.getTonerLevel());
        // System.out.println(printer.getNumPagePrinted());

        NewPrinter printer = new NewPrinter(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("inital page count= " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
