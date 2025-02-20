package Strategy.Before;

public class Soldeir extends GameCharacter{
    @Override
    public void fight() {
        System.out.println("Fight using axe.");
    }

    @Override
    public void heal() {
        System.out.println("Healing slowly.");
    }
}
