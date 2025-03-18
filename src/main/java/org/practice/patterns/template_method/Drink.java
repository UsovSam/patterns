package org.practice.patterns.template_method;

public abstract class Drink {

    public void boil() {
        System.out.println("Boiling water up to 100%");
    }

    public abstract void prepareMaterial();

    public void pour() {
        System.out.println("Pouring into cup");
    }

    public void steep() {
        System.out.println("Wait for 3 minutes");
    }

    public abstract void extra();

    public void serve() {
        System.out.println("Drink is ready");
    }

    public void makeDrink() {
        System.out.println("=================");
        System.out.println("Making drink");
        boil();
        prepareMaterial();
        pour();
        steep();
        extra();
        serve();
    }

}
