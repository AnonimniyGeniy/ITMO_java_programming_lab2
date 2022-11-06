package ru.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.attacks.*;


public class Gloom extends Pokemon {
    public Gloom(String name, int level) {
        super(name, level);
        setStats(60, 65, 70, 85, 75, 40);
        setType(Type.GRASS, Type.POISON);
        setMove(new Confide(), new SwordsDance(), new GigaDrain());
    }
}
