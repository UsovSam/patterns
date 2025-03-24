package org.practice.patterns.template_method;

public class Coffee extends Drink {
    @Override
    public void prepareMaterial() {
        System.out.println("prepare coffee");
    }

    @Override
    public void steep() {
        System.out.println("Steep for 10 minutes");
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void extra() {
        System.out.println("Add milk");
    }
}
