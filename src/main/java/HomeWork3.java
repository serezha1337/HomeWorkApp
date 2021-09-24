import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HomeWork3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //arrayFirstTask();
        //arraySecondTask();
        //arrayThirdTask();
        //squareArrayFourthTask();
        //arrayFifthTask();
        //arraySixthTask();
        //methodArraySeventhTask();
        //methodMoveArrayEightTask();
    }

    private static void methodMoveArrayEightTask() {
        int shiftFinal, shift;
        System.out.println("set shift: ");
        shift = sc.nextInt();
        int dressingRoom;
        final int ARRAY_SIZE = 5;
        shiftFinal = shift % ARRAY_SIZE;
        int[] moveMethod = new int[ARRAY_SIZE + ARRAY_SIZE];
        Random simpleRandom = new Random();
        for (int i = 0; i < moveMethod.length; i++) {
            if(i < ARRAY_SIZE){
                moveMethod[i] = simpleRandom.nextInt(5);
            }
            else{
                moveMethod[i] = moveMethod[i-ARRAY_SIZE];
            }
        }
        //I cant realise it without second array :(
        int[] moveMethodFinal = new int[ARRAY_SIZE];
        System.out.println("Array eight task: \n" );
        System.out.print("[");
        for (int i = 0; i < moveMethodFinal.length; i++) {
            System.out.print( + moveMethod[i] +", " );
        }
        System.out.println("]");
        System.out.println("move: " + shiftFinal);
        if (shiftFinal >= 0){
            for (int i = 0; i < moveMethodFinal.length; i++) {
                moveMethodFinal[i] = moveMethod[i+shiftFinal];
            }
        }else{
            for (int i = 0; i < moveMethodFinal.length; i++) {
                moveMethodFinal[i] = moveMethod[ARRAY_SIZE+ i + shiftFinal];
            }
        }
        System.out.println(Arrays.toString(moveMethodFinal));
    }

    private static void methodArraySeventhTask() {
        int firstHalf = 0, secondHalf = 0;
        boolean check = false;
        final int ARRAY_SIZE = 5;
        int[] methodArr = new int[ARRAY_SIZE];
            Random simpleRandom = new Random();
            for (int i = 0; i < methodArr.length; i++) {
                methodArr[i] = simpleRandom.nextInt(5);
           }
        System.out.println("Array seventh task: \n" + Arrays.toString(methodArr));
        for (int i = 0; i < methodArr.length; i++) {
            firstHalf += methodArr[i];
            for (int j = i+1; j < methodArr.length; j++) {
                secondHalf += methodArr[j];
            }
            if (firstHalf == secondHalf){
                check = true;
                for (int h = 0; h < methodArr.length; h++) {
                    System.out.print(methodArr[h]+" ");
                    if(h==i) {
                        System.out.print("|| ");
                    }
                }
                break;
            }
            secondHalf = 0;
        }
        System.out.println("\n" + check);
    }

    private static void arraySixthTask() {
        int max = 1, min = 99999999;
        final int ARRAY_SIZE = 10;
        int[] sixthArr = new int[ARRAY_SIZE];
        Random simpleRandom = new Random();
        for (int i = 0; i < sixthArr.length; i++) {
            sixthArr[i] = simpleRandom.nextInt(100);
        }
        for (int i = 0; i < sixthArr.length; i++) {
            if (sixthArr[i] > max){
                max = sixthArr[i];
            }
            else if(sixthArr[i] < min){
                min = sixthArr[i];
            }
        }
        System.out.println("Array sixth task: \n" +Arrays.toString(sixthArr) + "\nmax: " + max + " min: " + min );
    }

    private static void arrayFifthTask() {
        int len, initialValue;
        System.out.println("set lenth: ");
        len = sc.nextInt();
        System.out.println("set initial value: ");
        initialValue = sc.nextInt();
        int[] userArr = new int[len];
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = initialValue;
        }
        System.out.println("Array fifth task: ");
        System.out.println(Arrays.toString(userArr));
    }

    private static void squareArrayFourthTask() {
        final int SQUARE_ARRAY_SIZE = 4;
        int[][] sqArr = new int[SQUARE_ARRAY_SIZE][SQUARE_ARRAY_SIZE];
        for (int i = 0; i < sqArr.length; i++) {
            for (int j = 0; j < sqArr[i].length; j++) {

                if (i == j) {
                    sqArr[i][j] = 1;
                } else if (i + j == SQUARE_ARRAY_SIZE - 1) {
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 0;
                }
            }
        }
        //System.out.print("Square array fourth task:\n" + Arrays.deepToString(sqArr) + "\n");
        System.out.println("Square array fourth task:\n" + Arrays.deepToString(sqArr).replace("], ", "]\n"));
    }
    private static void arrayThirdTask() {
        int[] selectionArray = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Arrays third task: \n"+Arrays.toString(selectionArray));
        for (int i = 0; i < selectionArray.length; i++) {
            if (selectionArray[i] < 6){
                selectionArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(selectionArray));
    }

    private static void arraySecondTask() {
        int counter = 1;
        int[] anotherSimpleArr = new int[100];
        for (int i = 0; i < anotherSimpleArr.length; i++) {
            anotherSimpleArr[i] = counter++;
        }
        System.out.println("Array second task: \n"+Arrays.toString(anotherSimpleArr));

    }

    private static void arrayFirstTask() {
        final int ARRAY_SIZE = 25;
        int[] simpleArr = new int[ARRAY_SIZE];
        Random simpleRandom = new Random();
        for (int i = 0; i < simpleArr.length; i++) {
            simpleArr[i] = simpleRandom.nextInt(2);
        }
        System.out.println("Arrays first task: \n" + Arrays.toString(simpleArr));
        for (int i = 0; i < simpleArr.length; i++) {
            if (simpleArr[i] == 1){
                simpleArr[i] = 0;
            }else{
                simpleArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(simpleArr));
    }
}
