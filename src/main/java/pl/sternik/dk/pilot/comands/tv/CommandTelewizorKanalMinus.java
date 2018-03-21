package pl.sternik.dk.pilot.comands.tv;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.telewizor.Telewizor;

public class CommandTelewizorKanalMinus implements Command {
    public void execute() {
        Telewizor.instance().kanalMinus();
    }

    public String getOpis() {
        return "Telewizor kanał --";
    }
}