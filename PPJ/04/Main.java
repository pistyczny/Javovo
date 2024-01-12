public class Main {
    public static void main(String[] args) {
        long valI = 12345678901l;

        int valI1 = 1;
//        short valS = valI;

        double d = 3 / 2 / 1.0;
        System.out.println(d);


//=====================================

        if (true) {
            System.out.println("here");
            ;
        }

        if (true) {
            System.out.println("here");
            ;
        } else {
            System.out.println("not here");
            ;
        }


        if (5 > 7) {

        } else
            System.out.println();

        if (5 <= 7)
            System.out.println();

// ======================================
        {
        int x = 0;
        if (x >= 0)
            System.out.println("tu");

        if (x < 0)
            System.out.println("tu2");

        if (x >= 0)
            System.out.println("tu");
        else
            System.out.println("tu2");

//======================================================

        int y = 5;
        int z = 6;

        if (y == 5) {
            if (z == 6)
                System.out.println("tu3");
        }

        if (y == 5 && z == 6)
            System.out.println("tu3");

        // && - and

        /*
         * && T   F
         * T  T   F
         * F  F   F
         * */

        // || - or

        /*
         * || T   F
         * T  T   T
         * F  T   F
         * */

    }

        {
            int x = 10;

            if(
                x > 4 &&
                x < 22 &&
                (x > -3.14 && x < 49)
            )
                System.out.println("nalezy");

            if( x > 4 && x < 22)
                System.out.println("nalezy");
        }

//=================================================

        {
            int x = 1;

            switch(x){
                case 0:
                    System.out.println("tu0");
                    break;
                case 1:
                    System.out.println("tu1");
//                    break;
                case 10:
                    System.out.println("tu2");
                    break;
                default:
                    System.out.println("nie ma tu");
            }
        }

    }
}