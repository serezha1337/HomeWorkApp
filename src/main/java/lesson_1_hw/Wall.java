package lesson_1_hw;

public class Wall implements Obstacle{
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    public void accept(Jumpable jumpable){
        jumpable.jump(height);
    }
}
