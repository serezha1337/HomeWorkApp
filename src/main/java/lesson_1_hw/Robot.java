package lesson_1_hw;

public class Robot implements Runnable, Jumpable{
    private String name;
    private int maxJump;
    private int maxRun;
    private boolean isStopped = false;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean jump(int height) {
        if (height >= maxJump){
            System.out.println("Робот " + name + " перепрыгнул препятсвие высотой: " + height);
            return true;
        }
        else{
            System.out.println("Робот " + name + " не смог перепрыгнуть препятсвие высотой: " + height);
            isStopped = true;
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length >= maxRun){
            System.out.println("Робот " + name + " пробежал препятсвие длиной: " + length);
            return true;
        }
        else{
            System.out.println("Робот " + name + " не смог пробежать препятсвие длиной: " + length);
            isStopped = true;
            return false;
        }
    }

    @Override
    public boolean isStopped() {
        return false;
    }
}
