package Command;

public class VolumeUpCommand implements ICommand {
    private Airpods airpods;
    private double percent;

    public VolumeUpCommand(Airpods airpods, double percent) {
        this.airpods = airpods;
        this.percent = percent;
    }

    @Override
    public void execute() {
        airpods.volumeUp(percent);
    }
}
