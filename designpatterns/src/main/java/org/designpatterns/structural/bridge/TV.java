package org.designpatterns.structural.bridge;

public class TV implements  Device{

    @Override
    public void turnOn() {
       System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV OFF");
    }
}
