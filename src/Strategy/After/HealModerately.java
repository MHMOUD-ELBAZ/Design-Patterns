package Strategy.After;

public class HealModerately implements HealBehaviour{
    @Override
    public void heal() {
        System.out.println("Healing moderately");
    }
}
