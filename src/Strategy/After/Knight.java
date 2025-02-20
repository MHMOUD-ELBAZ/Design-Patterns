package Strategy.After;

public class Knight extends GameCharacter{
    public Knight(){
        fb = new FightWithSword();
        hb = new HealModerately();
    }
}
