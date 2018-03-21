package pl.sternik.dk.pilot.comands.wentylator;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.wentylator.Wentylator;

public class CommandWentylatorObroty2 implements Command {
    public void execute() {
        Wentylator.instance().obroty2();
    }

    public String getOpis() {
        return "Wentylator ustawiony na obroty2";
    }
}