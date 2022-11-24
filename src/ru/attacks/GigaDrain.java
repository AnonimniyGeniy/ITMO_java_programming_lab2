package ru.attacks;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {
    public GigaDrain() {
        super(Type.GRASS, 75, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        long newHp = Math.round((p.getStat(Stat.HP) - p.getHP()) * 0.5);
        Effect e = new Effect().turns(1).stat(Stat.HP, -1 * (int) newHp);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Giga Drain ";
    }
}
