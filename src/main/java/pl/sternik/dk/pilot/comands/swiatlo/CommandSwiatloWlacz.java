package pl.sternik.dk.pilot.comands.swiatlo;

        import pl.sternik.dk.pilot.comands.Command;
        import pl.sternik.dk.pilot.swiatlo.Swiatlo;

public class CommandSwiatloWlacz implements Command {
    public void execute() {
        Swiatlo.instance().wlacz();
    }

    public String getOpis() {
        return "Światło włącz";
    }
}