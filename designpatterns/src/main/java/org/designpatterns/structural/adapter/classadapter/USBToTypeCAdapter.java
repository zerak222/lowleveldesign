package org.designpatterns.structural.adapter.classadapter;

public class USBToTypeCAdapter extends USB implements TypeC{
    @Override
    public void chargeWithTypeC() {
        chargeWithUSB();
    }
}
