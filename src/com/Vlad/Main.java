package com.Vlad;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi, welcome to Bill's Burgers");
        Hamburger ham = chooseHamburger();
        System.out.println(ham.getPrice());
        ham.orderAdditions();
        ham.getTotal();
    }

    public static Hamburger chooseHamburger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose a burger:");
        System.out.println("1 - Bill's Regular, 2 - Healthy Burger, 3 - Deluxe Burger");
        int x = scanner.nextInt();
        return switch (x) {
            case 1 -> new Hamburger();
            case 2 -> new Healthy();
            case 3 -> new Deluxe();
            default -> throw new IllegalStateException("Unexpected value: " + x);
        };
    }

}
