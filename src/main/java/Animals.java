public class Animals {
    private String name;
    private int run;
    private int swim;

    public Animals(){
    }

    public Animals(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void animalInfo(){
        System.out.println("Животноe: " + name);
    }
    public void running(int run){
        System.out.println("Питомец пробежал %d метров" + run);
    }
    public void swimming(int swim){
        System.out.println("Питомец проплыл %d метров" + swim);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", swim=" + swim +
                '}';
    }
}
