package pl.sternik.dk.pilot.comands.garaz;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.garaz.Garaz;

public class CommandGarazOtworzDrzwi implements Command {
    public void execute() {
        Garaz.instance().drzwiGora();
    }

    public String getOpis() {
        return "Garaż otwarty";
    }
}