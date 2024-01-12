public class Main {
    public static void main(String[] args) {
        {
        int x = -4;

        String res = "";
        if (x < 0)
            res += "A";//A
        if (x > -10)
            res += "B";//B
        if (x > -5 && x < 5)
            res += "C";//C

        System.out.println("x nalezy do " + res);

        if (x >= 5)
            System.out.println("B");
        else if (x <= -10)
            System.out.println("A");
        else if (x <= -5)
            System.out.println("AB");
        else if (x <= 0)
            System.out.println("ABC");
        else
            System.out.println("BC");
    }

        {
            int x = 0;
            while(x < 10)
                System.out.println("while loop: " + x++);
            System.out.println("after while loop: " + x);
        }

        {
            int x = 0;
            do
                System.out.println("do-while loop: " + x++);
            while (x < 10);
            System.out.println("after do-while loop: " + x);
        }

        {
            int x = 10;
            while(x < 10)
                System.out.println("while loop: " + x++);
            System.out.println("after while loop: " + x);
        }

        {
            int x = 10;
            do
                System.out.println("do-while loop: " + x++);
            while (x < 10);
            System.out.println("after do-while loop: " + x);
        }

        {
            for(int x = 0; x < 10; x++)
                System.out.println("for loop: "+x);
        }

//        {
//            int x = 0;
//            for( x = 5; x < 10; x++)
//                System.out.println("for loop: "+x);
//            System.out.println("after loop: "+ x);
//        }

//        {
//            for( ;  ; )
//                System.out.println("for loop: ");
//        }

        {
            for(int i=0; i < 10; i++){
                System.out.println("for in1: "+i);
                if(i == 5)
                    break;
                System.out.println("for in2: "+i);
            }
            System.out.println("after for loop");
        }
        {
            for(int i=0; i < 10; i++){
                System.out.println("for in1: "+i);
                if(i == 5)
                    continue;
                System.out.println("for in2: "+i);
            }
            System.out.println("after for loop");
        }

        {
            int x1 = 10;
            int x2 = 10;
            System.out.println(x1 == x2);

            String str1 = new String("Hello");
            String str2 = new String("Hello");

            System.out.println(str1==str2);

            String str3 = "Hello";
            String str4 = "Hello";
            System.out.println(str3 == str4);

            str3 += 'a';
        }


    }
}