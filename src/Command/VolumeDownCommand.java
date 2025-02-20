package Command;

//concrete command
public class VolumeDownCommand implements ICommand {
    private Airpods airpods;
    private double percent;

    public VolumeDownCommand(Airpods airpods, double percent) {
        this.airpods = airpods;
        this.percent = percent;
    }

    @Override
    public void execute() {
        airpods.volumeDown(percent);
    }
}
