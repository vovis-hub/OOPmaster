package com.Vlad;

import java.util.Scanner;

public class Deluxe extends Hamburger {

    public Deluxe() {
        super("Whole Wheat roll","Chips", "drink", 32.50, "Deluxe Burger");
    }

    @Override
    public void orderAdditions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Deluxe Burger comes with chips and a drink");
        System.out.println("Please, choose your drink:");
        System.out.println("1 - Coca Cola, 2 - Orange Juice, 3 - Soda, 4 - Sparkling Water, 5 - nothing");
        String add;
        int x = scanner.nextInt();
        add = switch (x) {
            case 1 -> "Coca Cola";
            case 2 -> "Orange Juice";
            case 3 -> "Soda";
            case 4 -> "Sparkling Water";
            case 5 -> "nothing";
            default -> "invalid order";
        };
        this.add2 = add;
        System.out.println("You ordered " + add);
        scanner.close();

    }

    @Override
    public void getTotal() {
        System.out.println("You ordered a " + getName() + " on a "+ getBread() + " with:");
        System.out.println(getAdd1());
        System.out.println(getAdd2());
        System.out.println("Total: "+ getPrice());
    }
}
