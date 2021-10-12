public class Dogs extends Animals{
    public Dogs(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void animalInfo() {
        System.out.println("Собаkа: "+ getName());
    }

    @Override
    public void swimming(int swim) {
        if(getSwim()<= 10){
            System.out.println("Собачка успешно доплыла");
        }
        else {
            System.out.println("Ваша собака выдохлась и утонула, не доплыв "+ Math.abs((10 -getSwim())) +" метров, вы ужасный хозяин");
        }
    }

    @Override
    public void running(int run) {
        if(getRun()< 500){
            System.out.println("Ваша собачка успешно добежала");
        }
        else {
            System.out.println("Ваша собачка выдохлась и умерла");
        }
    }
}
