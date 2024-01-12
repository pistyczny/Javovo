public
    class Main {

    public static void main(String[] args) {
        {
            int[] tab = { 1, 3, 5, 7, 9, 11, 2, 4, 6, 8, 10};

            show(tab);
            tab[5] = 100;
            show(tab);
        }

        {
            displayNumbersRange( 20, 50);
        }

        {
            int wrt = resultMethodExample();
            System.out.println(wrt);

            System.out.println(
                add( 5, 3)
            );
        }

        {
            int[] tab = new int[2];
            tab[0] = 10;
            tab[1] = 20;

//            MyContainer myContainer = new MyContainer();
//            myContainer.iVal = 10;
//            myContainer.dVal = 3.14;
//            MyContainer myContainer2 = new MyContainer();
//            myContainer2.iVal = 10;
//            myContainer2.dVal = 3.14;
//            MyContainer myContainer3 = new MyContainer();
//            myContainer3.iVal = 10;
//            myContainer3.dVal = 3.14;

            MyContainer myContainer = convertToMyComntainer(tab);

            System.out.println(myContainer.iVal);
            System.out.println(myContainer.dVal);
        }

        {
            System.out.println(fiboI(10));
            System.out.println(fiboR(5));
        }

        {
            recursiveCounter(5);
        }

        {
            MyContainer myContainer = new MyContainer();
            myContainer.iVal = 10;
            myContainer.dVal = 3.14;

            showContainer(myContainer);
            increaseContainerValueBy1(myContainer);
            showContainer(myContainer);

            myContainer.showContainer();
            myContainer.increaseContainerValueBy1();
            myContainer.showContainer();
        }

        {
            MyContainer[] arr = new MyContainer[100];
            for(int i=0; i<100; i++){
                arr[i] = new MyContainer();
                arr[i].increaseContainerValueBy1();
            }
        }

    }

    public static void showContainer(MyContainer mc){
        System.out.println("MyContainer{");
        System.out.println("    iVal: "+mc.iVal);
        System.out.println("    dVal: "+mc.dVal);
        System.out.println("}");
    }

    public static void increaseContainerValueBy1(MyContainer mc){
        mc.iVal++;
    }

    public static void recursiveCounter(int n){
        System.out.println("->n:"+n);
        if(n > 0) {
            recursiveCounter(n-1);
        }
        System.out.println("<-n:"+n);
    }

    public static int fiboR(int n){
        System.out.println("fiboR("+n+")");
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        System.out.println("->fiboR("+(n-1)+")");
        return fiboR(n-1) + fiboR(n-2);
    }

    public static int fiboI(int n){

        int fib = 1,
            preFib = 1,
            tmp;

        for(int i=2; i<n; i++){
            tmp = fib;
            fib += preFib;
            preFib = tmp;
        }
        return fib;
    }

    public static MyContainer convertToMyComntainer(int[] arr){
        MyContainer myContainer = new MyContainer();
        myContainer.iVal = arr[0];
        myContainer.dVal = arr[1];
        return myContainer;
    }

    public static int add(int val1, int val2){
        return val1 + val2;
    }

    public static int resultMethodExample(){
        return 50;
    }

    public static void displayNumbersRange(int strat, int end){
        for(int i = strat; i < end; i++) {
            if (i == 30)
                return;
            System.out.print(i + " ");
        }
        System.out.println("tu");
    }

    public static void show(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println("]");

        return;
    }
}