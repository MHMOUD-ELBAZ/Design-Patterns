package Strategy.After;

public class Queen extends GameCharacter {
    public Queen() {
        fb = new CantFight();
        hb = new HealFast();
    }
}
