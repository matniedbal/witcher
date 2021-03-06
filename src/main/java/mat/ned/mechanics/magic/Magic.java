package mat.ned.mechanics.magic;

import mat.ned.mechanics.species.Species;

public abstract class Magic<E> {

    protected int manaCost;
    protected Species caster;
    protected Species target;

    public abstract void cast(Species species);
    public abstract void castEffects(Species caster);
    public abstract int getCastCost();
    public abstract String toString();
    public abstract String toVoice();


}
