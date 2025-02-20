package Strategy.Before;

public abstract class GameCharacter {
    public void move(){
        System.out.println("Character is moving...step...step.");
    }

    public abstract void fight();

    public abstract void heal();
}
