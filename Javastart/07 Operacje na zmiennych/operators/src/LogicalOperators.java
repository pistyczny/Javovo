public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("Czy x jest mniejsze od 0 lub Y jest wieksze od zera");
        System.out.println(x < 0);
        System.out.println(x > 0);
        System.out.println(x > 0 || y > 0);
        System.out.println(x < 0 || y > 0);
        System.out.println(x < 0 || y < 0);


        System.out.println(x > 0 && y > 0);
        System.out.println(x < 0 && y > 0);


    }
}
