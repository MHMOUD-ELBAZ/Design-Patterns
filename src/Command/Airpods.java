package Command;

public class Airpods {
    private AirpodsStatus status;

    public Airpods() {
        status = AirpodsStatus.STOPPED;
    }

    public void play(){
        status = AirpodsStatus.PLAYING;
        System.out.println("Music is playing");
    }

    public void pause(){
        status = AirpodsStatus.STOPPED;
        System.out.println("Music is paused");
    }
    public void volumeUp(double percent){
        System.out.println("Volume Up by "+percent );
    }
    public void volumeDown(double percent){
        System.out.println("Volume Down by "+percent );
    }

    public AirpodsStatus getStatus() {
        return status;
    }
}
