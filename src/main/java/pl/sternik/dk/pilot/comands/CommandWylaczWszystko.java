package pl.sternik.dk.pilot.comands;

import pl.sternik.dk.pilot.SprzetyFasade;

public class CommandWylaczWszystko implements Command {

    public void execute() {
        SprzetyFasade.wylaczWszystko();
    }

    public String getOpis() {
        return "Wylacz wszystko";
    }
}
