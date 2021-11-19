package lesson_1_hw;

public class RunningTrack implements Obstacle{
    public int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public void accept(Runnable runnable){
        runnable.run(length);
    }
}
