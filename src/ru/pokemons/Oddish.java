package ru.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.attacks.*;


public class Oddish extends Pokemon {
    public Oddish(String name, int level) {
        super(name, level);
        setStats(45, 50, 55, 75, 65, 30);
        setType(Type.GRASS, Type.POISON);
        setMove(new Confide(), new SwordsDance());
    }
}
