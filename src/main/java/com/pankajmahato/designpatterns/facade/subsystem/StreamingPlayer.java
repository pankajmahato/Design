package com.pankajmahato.designpatterns.facade.subsystem;

public class StreamingPlayer {

    public void on() {
        System.out.println("StreamingPlayer on");
    }

    public void off() {
        System.out.println("StreamingPlayer off");
    }

    public void play(String video) {
        System.out.println("Playing video: " + video);
    }

    public void stop() {
        System.out.println("StreamingPlayer stop");
    }
}
