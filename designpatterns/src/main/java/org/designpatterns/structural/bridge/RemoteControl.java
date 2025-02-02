package org.designpatterns.structural.bridge;

public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device aDevice){
        this.device = aDevice;
    }
    public abstract void power();
}
