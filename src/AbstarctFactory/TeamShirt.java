package AbstarctFactory;

public class TeamShirt extends Shirt{
    public TeamShirt(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Player Shirt with color: " + getColor();
    }
}
