package ru.attacks;

import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect = new Effect();
        effect = effect.condition(Status.SLEEP);
        effect = effect.turns(2);
        p.restore();
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Rest ";
    }
}