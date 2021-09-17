public class HomeWork_1 {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 15006;
        int b = -565999;
        if (a >= b){
            System.out.println(a + " >= " + b);
        }else{
            System.out.println(a + " < " + b);
        }
    }

    private static void printColor() {
        int value = 75;
        if (value <= 0){
            System.out.println("Krasnyy");
        }else if (value > 0 && value <= 100){
            System.out.println("Szheltyy");
        }else {
            System.out.println("Zelenyy");
        }
    }

    private static void checkSumSign() {
        int a = 10;
        int b = -154;
        if (a + b >= 0){
            System.out.println("Summa polozhitelnyaya");
        }else {
            System.out.println("Summa otrycatelnyaya");
        }
    }

    private static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
