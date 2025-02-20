package AbstarctFactory;

public class RefereeShirt extends Shirt {

    public RefereeShirt(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Referee Shirt with color: " + getColor();
    }
}
