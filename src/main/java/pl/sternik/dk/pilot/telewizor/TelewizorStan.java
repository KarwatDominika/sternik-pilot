package pl.sternik.dk.pilot.telewizor;

interface TelewizorStan {
    TelewizorStan wlacz();

    TelewizorStan wylacz();

    TelewizorStan glosniej();

    TelewizorStan ciszej();

    TelewizorStan nextKanal();

    TelewizorStan prevKanal();
}