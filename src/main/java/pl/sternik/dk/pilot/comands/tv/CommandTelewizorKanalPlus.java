package pl.sternik.dk.pilot.comands.tv;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.telewizor.Telewizor;

public class CommandTelewizorKanalPlus implements Command {
    public void execute() {
        Telewizor.instance().kanalPlus();;
    }

    public String getOpis() {
        return "Telewizor kanał ++";
    }
}