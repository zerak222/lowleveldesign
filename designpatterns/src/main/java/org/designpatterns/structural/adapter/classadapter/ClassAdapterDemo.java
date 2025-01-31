package org.designpatterns.structural.adapter.classadapter;

public class ClassAdapterDemo {
    public static void main(String[] args) {
        TypeC typeCCharger = new USBToTypeCAdapter();
        typeCCharger.chargeWithTypeC();
    }
}
