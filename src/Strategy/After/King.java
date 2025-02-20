package Strategy.After;

public class King extends GameCharacter{
    public King(){
        fb = new FightWithSword();
        hb = new HealFast();
    }
}
