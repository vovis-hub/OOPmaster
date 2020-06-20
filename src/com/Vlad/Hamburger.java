package com.Vlad;

public class Hamburger {

    private String bread;
    private String meat;
    private String add1;
    private String add2;
    private String add3;
    private String add4;
    private double price;

    private double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = Math.round(price);
    }

    public Hamburger() {
        this.bread = "Regular roll";
        this.meat = "Beef";
        this.add1 = null;
        this.add2 = null;
        this.add3 = null;
        this.add4 = null;
        this.price = 30;
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

    private String getAdd1() {
        return add1;
    }

    private void setAdd1(String add1) {
        this.add1 = add1;
    }

    private String getAdd2() {
        return add2;
    }

    private void setAdd2(String add2) {
        this.add2 = add2;
    }

    private String getAdd3() {
        return add3;
    }

    private void setAdd3(String add3) {
        this.add3 = add3;
    }

    private String getAdd4() {
        return add4;
    }

    private void setAdd4(String add4) {
        this.add4 = add4;
    }

    public void order


}
