package pl.sternik.dk.pilot.comands.swiatlo;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.swiatlo.Swiatlo;

public class CommandSwiatloWylacz implements Command {
    public void execute() {
        Swiatlo.instance().wylacz();
    }

    public String getOpis() {
        return "Światło wyłączone";
    }
}