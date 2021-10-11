public class HomeWork5 {
    public static void main(String[] args) {
        Employe employe1 = new Employe("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231246", 30000, 30);
        Employe employe2 = new Employe("Veniaminov Denis", "Programmer", "programpussy2212@gmail.com", "89855674563", 18457, 19);
        Employe employe3 = new Employe("Smirnov Sergey", "Director", "bossofthisgym@icloud.com", "89275463546", 110800, 60);


        Employe[] emlployersArray = new Employe[3];
        emlployersArray[0] = employe1;
        emlployersArray[1] = employe2;
        emlployersArray[2] = employe3;

        for (int i = 0; i < emlployersArray.length; i++) {
            if (emlployersArray[i].getAge() > 40){
                System.out.println(emlployersArray[i].toString());
            }
        }
    }
}
