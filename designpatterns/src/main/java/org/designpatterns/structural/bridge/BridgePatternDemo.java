package org.designpatterns.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new AdvancedRemote(new TV());
        remoteControl.power();
    }
}
