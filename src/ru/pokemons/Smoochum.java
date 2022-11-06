package ru.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.attacks.*;


public class Smoochum extends Pokemon {
    public Smoochum(String name, int level) {
        super(name, level);
        setStats(45, 30, 15, 85, 65, 65);
        setType(Type.ICE, Type.PSYCHIC);
        setMove(new Rest(), new Swagger(), new Psychic());
    }
}
