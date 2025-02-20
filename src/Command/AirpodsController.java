package Command;

//works as and invoker or sender class
public class AirpodsController {
    private ICommand oneTouch, doubleTouch, tripleTouch;

    public AirpodsController() {
        oneTouch = doubleTouch = tripleTouch = new DoNothingCommand();
    }

    //the client will use these methods set appropriate command for a specific action
    public void setOneTouch(ICommand oneTouchCommand) {
        oneTouch = oneTouchCommand;
    }
    public void setDoubleTouch(ICommand doubleTouchCommand) {
        doubleTouch = doubleTouchCommand;
    }
    public void setTripleTouch(ICommand tripleTouchCommand) {
        tripleTouch = tripleTouchCommand;
    }

    //client will call these methods when touches are encountered
    public void handleOneTouch(){
        oneTouch.execute();
    }
    public void handleDoubleTouch(){
        doubleTouch.execute();
    }
    public void handleTripleTouch(){
        tripleTouch.execute();
    }
}
