package org.designpatterns.structural.adapter.objectadapter;

public class USBToTypeCAdapter implements  TypeC{
    private USB usb;
    public USBToTypeCAdapter(USB aUsb){
        this.usb = aUsb;
    }
    @Override
    public void chargeWithTYpeC() {
        usb.chargeWithUSB();
    }
}
