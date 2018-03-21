package pl.sternik.dk.pilot.comands;

import pl.sternik.dk.pilot.SprzetyFasade;

public class CommandTrybKanapowy implements Command {

    public void execute() {
        SprzetyFasade.wlaczTrybKanapowy();
    }

    public String getOpis() {
        return "Włącz tryb kanapowy";
    }
}