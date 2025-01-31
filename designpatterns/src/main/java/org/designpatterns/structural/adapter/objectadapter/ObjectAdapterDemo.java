package org.designpatterns.structural.adapter.objectadapter;

public class ObjectAdapterDemo {
    public static void main(String[] args) {
        USB usb = new USB();
        TypeC typeC = new USBToTypeCAdapter(usb);
        typeC.chargeWithTYpeC();
    }
}
