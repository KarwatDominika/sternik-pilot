package pl.sternik.dk.pilot.comands.wentylator;


import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.wentylator.Wentylator;

public class CommandWentylatorObroty1 implements Command {
    public void execute() {
        Wentylator.instance().obroty1();
    }

    public String getOpis() {
        return "Wentylator ustawiony na obroty1";
    }
}