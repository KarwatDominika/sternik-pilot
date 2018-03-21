package pl.sternik.dk.pilot.comands.tv;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.telewizor.Telewizor;

public class CommandTelewizorWlacz implements Command {
    public void execute() {
        Telewizor.instance().wlacz();
    }

    public String getOpis() {
        return "Włączam telewizor";
    }
}