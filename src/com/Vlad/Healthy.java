package com.Vlad;

import java.util.Scanner;

public class Healthy extends Hamburger{

   private String add5;
   private String add6;

    public Healthy() {
        super("Brown Rye", "Healthy Burger", 22.50);
        this.add5 = "";
        this.add6 = "";
    }

    public String getAdd5() {
        return add5;
    }

    public String getAdd6() {
        return add6;
    }

    @Override
    public void orderAdditions() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 7; i++) {
            System.out.println("Please, choose addition #" + i);
            System.out.println("1 - lettuce, 2 - tomato, 3 - onion, 4 - ketchup, 5 - greens, 6 - organic beats, 7 - nothing");
            String add;
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    add = "lettuce";
                    price += 2.00;
                    break;
                case 2:
                    add = "tomato";
                    price += 4.00;
                    break;
                case 3:
                    add = "onion";
                    price += 0.75;
                    break;
                case 4:
                    add = "ketchup";
                    price += 0.50;
                    break;
                case 5:
                    add = "greens";
                    price += 3.00;
                    break;
                case 6:
                    add = "organic beats";
                    price += 2.50;
                    break;
                case 7:
                    add = "nothing";
                    price += 0.00;
                    break;
                default:
                    add = "invalid order";
                    price += 0.00;
            }
            System.out.println("Your addition #" + i + " is " + add);
            switch (i) {
                case 1 -> this.add1 = add;
                case 2 -> this.add2 = add;
                case 3 -> this.add3 = add;
                case 4 -> this.add4 = add;
                case 5 -> this.add5 = add;
                case 6 -> this.add6 = add;
            }
        }
        scanner.close();
    }

    @Override
    public void getTotal() {
        System.out.println("You ordered a " + getName() + " with:");
        System.out.println(getAdd1());
        System.out.println(getAdd2());
        System.out.println(getAdd3());
        System.out.println(getAdd4());
        System.out.println(getAdd5());
        System.out.println(getAdd6());
        System.out.println("Total: "+ getPrice());
    }
}
