package Command;

public class DoNothingCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Nothing to do.");
    }
}
