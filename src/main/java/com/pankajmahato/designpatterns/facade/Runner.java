package com.pankajmahato.designpatterns.facade;

import com.pankajmahato.designpatterns.facade.subsystem.Amplifier;
import com.pankajmahato.designpatterns.facade.subsystem.Projector;
import com.pankajmahato.designpatterns.facade.subsystem.StreamingPlayer;

public class Runner {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Projector(),
                new StreamingPlayer()
        );

        homeTheaterFacade.watchMovie("Dune");
        homeTheaterFacade.endMovie();
    }
}
