package pl.sternik.dk.pilot;

import pl.sternik.dk.pilot.garaz.Garaz;
import pl.sternik.dk.pilot.swiatlo.Swiatlo;
import pl.sternik.dk.pilot.telewizor.Telewizor;
import pl.sternik.dk.pilot.wentylator.Wentylator;

public abstract class SprzetyFasade {

    public static void wylaczWszystko() {
        Swiatlo.instance().wylacz();
        Telewizor.instance().wylacz();
        Wentylator.instance().obroty2();
        Wentylator.instance().obroty1();
        Wentylator.instance().wylacz();
    }

    public static void wylaczWszystkoWyjezdzam() {
        wylaczWszystko();
        Garaz.instance().drzwiGora();
    }

    public static void wlaczTrybKanapowy() {
        Swiatlo.instance().wlacz();
        Telewizor.instance().wlacz();
        Wentylator.instance().wlacz();
    }
}