package pl.sternik.dk.pilot.comands.garaz;

        import pl.sternik.dk.pilot.comands.Command;
        import pl.sternik.dk.pilot.garaz.Garaz;

public class CommandGarazZamknijDrzwi implements Command {
    public void execute() {
        Garaz.instance().drzwiDol();
    }

    public String getOpis() {
        return "Garaż zamknięty";
    }
}