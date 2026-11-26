package com.pankajmahato.designpatterns.facade;

import com.pankajmahato.designpatterns.facade.subsystem.Amplifier;
import com.pankajmahato.designpatterns.facade.subsystem.Projector;
import com.pankajmahato.designpatterns.facade.subsystem.StreamingPlayer;

public class HomeTheaterFacade {

    private final Amplifier amplifier;
    private final Projector projector;
    private final StreamingPlayer streamingPlayer;

    public HomeTheaterFacade(Amplifier amplifier, Projector projector, StreamingPlayer streamingPlayer) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.streamingPlayer = streamingPlayer;
    }

    public void watchMovie(String movieName) {
        System.out.println("Ready to watch movie");
        amplifier.on();
        amplifier.setVolume(40);
        projector.on();
        projector.wideScreenMode();
        streamingPlayer.on();
        streamingPlayer.play(movieName);
    }

    public void endMovie() {
        System.out.println("Ending movie");
        streamingPlayer.stop();
        streamingPlayer.off();
        projector.off();
        amplifier.off();
    }
}
