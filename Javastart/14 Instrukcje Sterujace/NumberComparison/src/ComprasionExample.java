public class ComprasionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        if (a > b) {
            System.out.println("A > B");
            // wynik a>b to false, więc sprawdzany jest kolejny warunek
        } else if (b > c) {
            System.out.println("B > C");
            // wynik b>c to true, więc trzeci warunek nie jest już sprawdzany
        } else if (c > a) {
            System.out.println("C > A");
        }

        if (a > b) {
            System.out.println("(2) A > B");
        }
        if (b > c) {
            System.out.println("(2) B > C");
        }
        if (c > a) {
            System.out.println("(2) C > A");
        }




    }
}
