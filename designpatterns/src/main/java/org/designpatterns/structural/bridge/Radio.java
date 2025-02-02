package org.designpatterns.structural.bridge;

public class Radio implements  Device{
    @Override
    public void turnOn() {
        System.out.println("Radio On");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio Off");
    }
}
