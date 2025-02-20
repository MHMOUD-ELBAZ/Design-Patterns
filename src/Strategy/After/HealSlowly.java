package Strategy.After;

public class HealSlowly implements HealBehaviour{

    @Override
    public void heal() {
        System.out.println("Healing slowly");
    }
}
