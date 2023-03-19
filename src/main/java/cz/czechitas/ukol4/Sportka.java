package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        for (int cislaDoSportky = 1; cislaDoSportky <= 49; cislaDoSportky++) {
            osudi.add(cislaDoSportky);
        }
    }


    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichat() {
        shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> vylosovanaCisla() {
        return osudi.subList(0, 6);
    }


    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dodatkoveCislo() {
        //TODO Vrátit sedmé číslo z osudí.
        return osudi.get(6);
    }
}
