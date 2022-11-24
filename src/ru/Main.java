package ru;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Delibird("Delibird", 25);
        Pokemon p2 = new Gloom("Gloom", 25);
        Pokemon p3 = new Jynx("Jynx", 10);
        Pokemon p4 = new Vileplume("Vileplume", 15);
        Pokemon p5 = new Oddish("Oddish", 25);
        Pokemon p6 = new Smoochum("Smoochum", 25);
        b.addAlly(p1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        //System.out.println(b.allies.size());
        b.go();
    }
}