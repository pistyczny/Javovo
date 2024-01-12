
// .
import java.util.Random;

public class Cw1 {
    public static void main(String[] args) {

//        Random rand = new Random();
//
//        int number = rand.nextInt(10);
//        int number2 = new Random().nextInt(10);
//
//        System.out.println(number);
//        System.out.println(number2);


        int x;
        int y;

        Random randomowe = new Random();

        x = new Random().nextInt(10);
        y = randomowe.nextInt(10);

        System.out.println("x to : " + x);
        System.out.println("y to : " + y);

        System.out.print("Czy x jest wieksze od y: ");
        System.out.println(x > y);

        System.out.print("Czy x pomnozone przez 2 jest wieksze od y: ");
        System.out.println(x * 2 > y);

        System.out.print("Czy y jest mniejsze od sumy x + 3 i jednoczesnie wieksze od x pomniejszonego o 2 ?");
        System.out.println(y < x + 3 && y > x -2);


        System.out.println("Czy iloczyn liczb x i y jest parzysty?"); // Wykorzystaj do sprawdzenia moduloooo
        System.out.println(x * y % 2 == 0);
//        System.out.println(x % 2 == 0 && y % 2 == 0);

    }
}
