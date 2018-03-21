package pl.sternik.dk.pilot.comands.tv;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.telewizor.Telewizor;

public class CommandTelewizorWylacz implements Command {
    public void execute() {
        Telewizor.instance().wylacz();
    }

    public String getOpis() {
        return "Wyłączam telewizor";
    }
}