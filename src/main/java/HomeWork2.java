public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(checkSumm(15, 9));
        int chisloMethodTwo = -500;
        System.out.println("Ваше число со знаком " + checkChislo(chisloMethodTwo));
        System.out.println(otricOrNot(500));
        printStrok(":-) ", 3);
        System.out.println(visokosOrNot(2024));
    }

    private static boolean visokosOrNot(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }return false;
    }

    private static void printStrok(String s, int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(s);
        }
        System.out.println();
    }

    private static boolean otricOrNot(int i) {
        if (i >= 0){
            return false;
        }return true;
    }

    private static char checkChislo(int chislo) {
        if (chislo >= 0){
            return '+';
        }return '-';
    }

    private static boolean checkSumm(int chislo1, int chislo2) {
        if (chislo1 + chislo2 >= 10 && chislo1 + chislo2 <= 20){
            return true;
        }return false;
    }
}

