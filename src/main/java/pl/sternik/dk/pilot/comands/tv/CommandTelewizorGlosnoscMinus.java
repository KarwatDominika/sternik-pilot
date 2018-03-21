package pl.sternik.dk.pilot.comands.tv;


import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.telewizor.Telewizor;

public class CommandTelewizorGlosnoscMinus implements Command {

    public void execute() {
        Telewizor.instance().glosnoscMinus();
    }

    public String getOpis() {
        return "Telewizor głośność --";
    }
}