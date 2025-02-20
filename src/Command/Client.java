package Command;

//The invisible power:
public class Client {
    public static void main(String[] args) {
        Airpods airpods = new Airpods();
        ICommand up = new VolumeUpCommand(airpods, 0.1);
        ICommand down = new VolumeDownCommand(airpods, 0.1);
        ICommand pausePlay = new PlayPauseCommand(airpods);

        AirpodsController controller = new AirpodsController();

        //There some part in which user will choose
        controller.setOneTouch(pausePlay);
        controller.setDoubleTouch(up);
        controller.setTripleTouch(down);

        //Handle touches
        controller.handleOneTouch();
        controller.handleDoubleTouch();
        controller.handleTripleTouch();
    }
}
