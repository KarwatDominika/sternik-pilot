package pl.sternik.dk.pilot.comands.tv;

import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.telewizor.Telewizor;

public class CommandTelewizorGlosnoscPlus implements Command {

    public void execute() {
        Telewizor.instance().glosnoscPlus();
    }

    public String getOpis() {
        return "Telewizor głośność ++";
    }
}