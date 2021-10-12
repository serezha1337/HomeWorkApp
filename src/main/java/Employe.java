public class Employe {
    private String fullName;
    private String position;
    private String eMail;
    private String mobileNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employe(){

    }

    public Employe(String fullName, String position, String eMail, String mobileNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;
    }


    public String toString() {
        return "Employers {" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


}
