package org.designpatterns.structural.bridge;

public class AdvancedRemote extends RemoteControl{
    public AdvancedRemote(Device aDevice) {
        super(aDevice);
    }

    @Override
    public void power() {
        System.out.println("Toggling power ....");
        device.turnOn();
        device.turnOff();
    }
}
