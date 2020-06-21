package com.Vlad;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Hamburger {

    public String bread;
    public String meat;
    public String add1;
    public String add2;
    public String add3;
    public String add4;
    public double price;
    public String name;

    public String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    private void setPrice(double price) {

        this.price = price;
    }

    public Hamburger(String add1, String add2, double price, String name) {
        this.add1 = add1;
        this.add2 = add2;
        this.price = price;
        this.name = name;
    }

    public Hamburger(String bread, String name, double price) {
        this.bread = bread;
        this.name = name;
    }

    public Hamburger() {
        this.bread = "Regular roll";
        this.meat = "Beef";
        this.add1 = null;
        this.add2 = null;
        this.add3 = null;
        this.add4 = null;
        this.price = 20;
        this.name = "Bill's Regular";
    }

    private String getBread() {
        return bread;
    }

    private void setBread(String bread) {
        this.bread = bread;
    }

    private String getMeat() {
        return meat;
    }

    private void setMeat(String meat) {
        this.meat = meat;
    }

    String getAdd1() {
        return add1;
    }

    private void setAdd1(String add1) {
        this.add1 = add1;
    }

    String getAdd2() {
        return add2;
    }

    private void setAdd2(String add2) {
        this.add2 = add2;
    }

    String getAdd3() {
        return add3;
    }

    private void setAdd3(String add3) {
        this.add3 = add3;
    }

    String getAdd4() {
        return add4;
    }

    private void setAdd4(String add4) {
        this.add4 = add4;
    }

    public void orderAdditions() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Please, choose addition #" + i);
            System.out.println("1 - lettuce, 2 - tomato, 3 - onion, 4 - ketchup, 5 - nothing");
            String add;
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    add = "lettuce";
                    this.price += 2.00;
                    break;
                case 2:
                    add = "tomato";
                    this.price += 4.00;
                    break;
                case 3:
                    add = "onion";
                    this.price += 0.75;
                    break;
                case 4:
                    add = "ketchup";
                    this.price += 0.50;
                    break;
                case 5:
                    add = "nothing";
                    this.price += 0.00;
                    break;
                default:
                    add = "invalid order";
                    this.price+=0.00;
            }
            System.out.println("Your addition #" + i + " is " + add);
            switch (i) {
                case 1 -> this.add1 = add;
                case 2 -> this.add2 = add;
                case 3 -> this.add3 = add;
                case 4 -> this.add4 = add;
            }
        }
        scanner.close();
    }

    public void getTotal() {
        System.out.println("You ordered a " + getName() + " with:");
        System.out.println(getAdd1());
        System.out.println(getAdd2());
        System.out.println(getAdd3());
        System.out.println(getAdd4());
        System.out.println("Total: "+ getPrice());
    }


}
