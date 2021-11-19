package lesson_1_hw;

public class Human implements Runnable, Jumpable{
    private String name;
    private int maxJump;
    private int maxRun;
    private boolean isStopped = false;

    public Human(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", maxJump=" + maxJump +
                ", maxRun=" + maxRun +
                ", isStopped=" + isStopped +
                '}';
    }

    @Override
    public boolean jump(int height) {
        if (height >= maxJump){
            System.out.println("Кожанный мешок с костями " + name + " перепрыгнул препятсвие высотой: " + height);
            return true;
        }
        else{
            System.out.println("Кожанный мешок с костями " + name + " не смог перепрыгнуть препятсвие высотой: " + height);
            isStopped = true;
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length >= maxRun){
            System.out.println("Кожанный мешок с костями " + name + " пробежал препятсвие длиной: " + length);
            return true;
        }
        else{
            System.out.println("Кожанный мешок с костями " + name + " не смог пробежать препятсвие длиной: " + length);
            isStopped = true;
            return false;
        }
    }

    @Override
    public boolean isStopped() {
        return false;
    }
}
