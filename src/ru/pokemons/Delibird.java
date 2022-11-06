package ru.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.attacks.*;


public class Delibird extends Pokemon {
    public Delibird(String name, int level) {
        super(name, level);
        setStats(45, 55, 45, 65, 45, 75);
        setType(Type.NORMAL);
        setMove(new Splash(), new Rest(), new IcyWind(), new AuroraBeam());
    }
}
