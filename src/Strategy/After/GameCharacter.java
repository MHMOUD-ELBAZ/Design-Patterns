package Strategy.After;

public abstract class GameCharacter {
    protected HealBehaviour hb;
    protected FightBehaviour fb;

    public void move(){
        System.out.println("Character is moving...step...step.");
    }

    public void fight(){
        this.fb.fight();
    }

    public void heal(){
        this.hb.heal();
    }

    public void setFb(FightBehaviour fb) {
        this.fb = fb;
    }

    public void setHb(HealBehaviour hb) {
        this.hb = hb;
    }
}
