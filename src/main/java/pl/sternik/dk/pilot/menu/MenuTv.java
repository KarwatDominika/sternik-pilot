package pl.sternik.dk.pilot.menu;


import java.util.Map;
import java.util.TreeMap;

import pl.sternik.dk.pilot.Pilot;
import pl.sternik.dk.pilot.comands.Command;
import pl.sternik.dk.pilot.comands.CommandPrzelaczMenu;
import pl.sternik.dk.pilot.comands.CommandPusty;
import pl.sternik.dk.pilot.comands.CommandTrybKanapowy;
import pl.sternik.dk.pilot.comands.CommandWylaczWszystko;
import pl.sternik.dk.pilot.comands.CommandZakoncz;
import pl.sternik.dk.pilot.comands.tv.CommandTelewizorGlosnoscMinus;
import pl.sternik.dk.pilot.comands.tv.CommandTelewizorGlosnoscPlus;
import pl.sternik.dk.pilot.comands.tv.CommandTelewizorKanalMinus;
import pl.sternik.dk.pilot.comands.tv.CommandTelewizorKanalPlus;
import pl.sternik.dk.pilot.comands.tv.CommandTelewizorWlacz;
import pl.sternik.dk.pilot.comands.tv.CommandTelewizorWylacz;

public class MenuTv implements MenuPilota {

    private Map<String, Command> przyciski = new TreeMap<String, Command>();
    private Pilot pilot;

    public MenuTv(Pilot pilot) {
        this.pilot = pilot;
        przyciski.put("1", new CommandTelewizorWlacz());
        przyciski.put("2", new CommandTelewizorWylacz());
        przyciski.put("3", new CommandTelewizorGlosnoscPlus());
        przyciski.put("4", new CommandTelewizorGlosnoscMinus());
        przyciski.put("5", new CommandTelewizorKanalPlus());
        przyciski.put("6", new CommandTelewizorKanalMinus());
        przyciski.put("7", new CommandPusty());
        przyciski.put("8", new CommandTrybKanapowy());
        przyciski.put("9", new CommandWylaczWszystko());
        przyciski.put("0", new CommandPrzelaczMenu(pilot));
        przyciski.put("Z", new CommandZakoncz());
    }

    public String getOpis() {
        return "Menu TV";
    }

    @Override
    public Command getCommandForKey(String command) {
        return przyciski.get(command);
    }
    public void wyswietlMenu() {
        System.out.println("------>Menu TV<------");
        for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
        }
    }
}