package pl.sternik.dk.pilot.garaz;

public class GarazZamkniety implements GarazStan {

    @Override
    public void open() {
        System.out.println("Otwieram garaz");

    }

    @Override
    public void close() {
        System.out.println("Nic nie robię");
    }
}