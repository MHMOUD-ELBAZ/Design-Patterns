package Strategy.Before;

public class King extends GameCharacter{
    @Override
    public void fight() {
        System.out.println("Fight using a sword");
    }

    @Override
    public void heal() {
        System.out.println("Healing so fast");
    }
}
