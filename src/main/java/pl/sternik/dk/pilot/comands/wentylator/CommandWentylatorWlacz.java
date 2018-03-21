package pl.sternik.dk.pilot.comands.wentylator;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.wentylator.Wentylator;

public class CommandWentylatorWlacz implements Command {
    public void execute() {
        Wentylator.instance().wlacz();
    }

    public String getOpis() {
        return "Wentylator włączony";
    }
}