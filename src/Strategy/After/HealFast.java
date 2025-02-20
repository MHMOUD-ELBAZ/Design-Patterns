package Strategy.After;

public class HealFast implements  HealBehaviour{
    @Override
    public void heal() {
        System.out.println("Healing so fast");
    }
}
