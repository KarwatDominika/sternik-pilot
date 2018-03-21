package pl.sternik.dk.pilot.menu;

import pl.sternik.dk.pilot.comands.Command;

public interface MenuPilota {
    String getOpis();
    public void wyswietlMenu();
    Command getCommandForKey(String upperCase);
}