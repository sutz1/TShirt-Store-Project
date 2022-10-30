package com.ata;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import com.ata.Product;
import com.ata.Shop;
import com.ata.Menu;
/**
 * The ShopRunner class is the main entry point for the application.
 * It encapsulates a Menu, providing it with a Scanner configured
 * with System.in to allow the menu to read from standard in.
 * When the application starts, the menu's greet and show methods are called.
 */
public class ShopRunner {
    /**
     * Main entry point to the application.
     * Asks the menu's greeting to be printed to standard out by calling its greet method.
     * Asks the menu to be shown by calling its show method.
     * @param args Command line arguments to the application
     */
    public static void main(String[] args) {
        Product crewNeck = new Product(0, "Crew Neck", 20.00);
        Product vNeck = new Product(1, "V-Neck", 20.00);
        Product polo = new Product(2, "Polo", 25.50);
        Product boatNeck = new Product(3, "Boat Neck", 30.25);
        Product tankTop = new Product(4, "Tank Top", 15.75);

        //Product[] products = new Product[] {crewNeck, vNeck, polo, boatNeck, tankTop};
        ArrayList<com.ata.Product> products = new ArrayList<Product>(Arrays.asList(crewNeck, vNeck, polo, boatNeck, tankTop));
        Shop myShop = new Shop();

        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))), myShop);
        menu.greet();
        menu.executeMenu();
    }
}