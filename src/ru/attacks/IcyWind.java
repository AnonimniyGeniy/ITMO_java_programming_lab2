package ru.attacks;

import ru.ifmo.se.pokemon.*;


public class IcyWind extends StatusMove {
    public IcyWind() {
        super(Type.ICE, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует Icy Wind ";
    }
}