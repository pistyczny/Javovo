public class Conversions {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.8;
        int c = (int) b; // konwersja zawezajaca
        double d = (double) a; // konwersja rozszerzajaca i istnieje konwersja jawna?
        System.out.println(c);
        System.out.println(d);
        System.out.println(a);

    }
}
