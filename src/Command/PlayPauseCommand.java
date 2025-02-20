package Command;

public class PlayPauseCommand implements ICommand {
    private Airpods airpods;

    public PlayPauseCommand(Airpods airpods) {
        this.airpods = airpods;
    }
    @Override
    public void execute() {
        if(airpods.getStatus() == AirpodsStatus.PLAYING)
            airpods.pause();
        else
            airpods.play();
    }
}
