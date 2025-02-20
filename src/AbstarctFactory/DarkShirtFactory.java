package AbstarctFactory;

public class DarkShirtFactory implements ShirtFactory {

    @Override
    public TeamShirt createTeam1Shirt() {
        return new TeamShirt("Black");
    }

    @Override
    public TeamShirt createTeam2Shirt() {
        return new TeamShirt("Dark Green");
    }

    @Override
    public RefereeShirt createRefereeShirt() {
        return new RefereeShirt("Yellow");
    }
}
