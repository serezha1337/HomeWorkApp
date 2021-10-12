public class Cats extends Animals {
    public Cats(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void swimming(int swim) {
        System.out.println("Ваша кошечкa не умеет плавать :( ");
    }

    @Override
    public void running(int swim) {
        if(getRun()< 200){
            System.out.println("Ваша кошечка успешно добежала!");
        }
        else {
            System.out.println("Ваша кошечка выдохлась и умерла");
        }
    }

    public void animalInfo(){
        System.out.println("Кот: " + getName());
    }

}
