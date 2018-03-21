package pl.sternik.dk.pilot.comands;

import pl.sternik.dk.pilot.SprzetyFasade;

public class CommandWylaczWszystkoWyjezdzam implements Command {

    public void execute() {
        SprzetyFasade.wylaczWszystkoWyjezdzam();
    }

    public String getOpis() {
        return "Wylacz wszystko otwóż garaż";
    }
}