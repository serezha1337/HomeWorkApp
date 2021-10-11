public class HomeWork6 {
    public static void main(String[] args) {
        Cats BorisCat = new Cats("Boris", 200, 0);
        Dogs StyopaDog = new Dogs("Styopa", 600, 11);
        System.out.println(BorisCat.toString());
        System.out.println(StyopaDog.toString());
        BorisCat.swimming(BorisCat.getSwim());
        StyopaDog.swimming(StyopaDog.getSwim());


    }
}
