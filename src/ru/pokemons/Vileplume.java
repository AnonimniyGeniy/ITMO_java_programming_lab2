package ru.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.attacks.*;


public class Vileplume extends Pokemon {
    public Vileplume(String name, int level) {
        super(name, level);
        setStats(75, 80, 85, 110, 90, 50);
        setType(Type.GRASS, Type.POISON);
        setMove(new Confide(), new SwordsDance(), new GigaDrain(), new DoubleTeam());
    }
}
