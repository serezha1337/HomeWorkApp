package OOP_7;

import java.util.Scanner;

public class Plate {

    private int food;

    public Plate(){
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public boolean decreaseFood(int appetite, int satiety){
        if(appetite> food){
            System.out.println("Маля, кот не наестся :Р");
            return false;
        }
        else{
            do{
                food -= appetite;
                satiety -= appetite;
                System.out.println("ОМНОМном ном.... омномном..");
                System.out.println("plate: " + food);
            }while(food > 0);
            if (satiety <= 0){
                return true;
            }
            else{
                return false;
            }
        }

    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int f){
        food += f;
    }
}
