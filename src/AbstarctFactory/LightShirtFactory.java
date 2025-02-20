package AbstarctFactory;

public class LightShirtFactory implements ShirtFactory {
    @Override
    public TeamShirt createTeam1Shirt() {
        return new TeamShirt("White");
    }

    @Override
    public TeamShirt createTeam2Shirt() {
        return new TeamShirt("Red");
    }

    @Override
    public RefereeShirt createRefereeShirt() {
        return new RefereeShirt("Green");
    }
}
