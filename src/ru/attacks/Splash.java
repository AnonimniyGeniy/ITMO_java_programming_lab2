package ru.attacks;

import ru.ifmo.se.pokemon.*;


public class Splash extends StatusMove {
    public Splash() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует Splash ";
    }
}