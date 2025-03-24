package org.practice.patterns.template_method;

public class Tea extends Drink {
    @Override
    public void prepareMaterial() {
        System.out.println("prepare tea");
    }

    @Override
    public void extra() {
        System.out.println("Nothing to add");
    }
}
