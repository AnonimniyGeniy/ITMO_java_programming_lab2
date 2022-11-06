package ru.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.attacks.*;


public class Jynx extends Pokemon {
    public Jynx(String name, int level) {
        super(name, level);
        setStats(65, 50, 35, 115, 95, 95);
        setType(Type.ICE, Type.PSYCHIC);
        setMove(new Rest(), new Swagger(), new Psychic(), new BodySlam());
    }
}
