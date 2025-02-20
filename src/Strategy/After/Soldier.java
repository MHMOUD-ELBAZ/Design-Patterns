package Strategy.After;

public class Soldier extends  GameCharacter{
    public Soldier(){
        fb = new FightWithAxe();
        hb = new HealSlowly();
    }
}
