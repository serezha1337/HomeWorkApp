package OOP_7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;
    private boolean satietyTrue;


    public int getSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satietyTrue=" + satietyTrue +
                '}';
    }

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate plate) {
        satietyTrue =plate.decreaseFood(appetite, satiety);
    }

}
