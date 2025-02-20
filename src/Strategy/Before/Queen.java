package Strategy.Before;

public class Queen extends GameCharacter{
    @Override
    public void fight() {
        System.out.println("Can't fight.");
    }

    @Override
    public void heal() {
        System.out.println("Healing so fast.");
    }
}
