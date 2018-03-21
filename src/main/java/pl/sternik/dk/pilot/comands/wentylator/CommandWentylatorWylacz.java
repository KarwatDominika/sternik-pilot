package pl.sternik.dk.pilot.comands.wentylator;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.wentylator.Wentylator;

public class CommandWentylatorWylacz implements Command {
    public void execute() {
        Wentylator.instance().wylacz();
    }

    public String getOpis() {
        return "Wentylator wyłączony";
    }
}