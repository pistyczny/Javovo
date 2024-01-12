import java.util.Arrays;

public
    class Wyklad09 {

    public static void main(String[] args) {
        Wyklad09.show();
        show();

        A.showB();

        for(String str : args)
            System.out.println(str);


        method1(5+3);

        {
            int value = 10;
            System.out.println("main:value = " + value);
            method2(value);
            System.out.println("main:value = " + value);
        }

        {
            int[] arr = {10, 20, 30, 40, 50};
            System.out.println("main:arr = "+ Arrays.toString(arr));
            method3(arr);
            System.out.println("main:arr = "+ Arrays.toString(arr));

        }

        {
            int val = 10;
            System.out.println("main:value = " + val);
            val = method4(val);
            System.out.println("main:value = " + val);
        }

        {
            method5(120);
            method5(3.14f);
            method5('c');
            method5(12345678901L);
            method5(3.14f);
        }
    }

    public static void method5(short val){
        System.out.println("method5(short)");
    }
    public static void method5(double val){
        System.out.println("method5(double)");
    }
    public static void method5(int val){
        System.out.println("method5(int)");
    }


    public static int method4(int fVal) {
        return 50;
    }
    public static void method3(int[] fArr){
        System.out.println("method3:fArr = " + Arrays.toString(fArr));
        fArr[1] = 99;
        System.out.println("method3:fArr = " + Arrays.toString(fArr));
    }

    public static void method2(int val){
        System.out.println("method2:val = "+val);
        val = 20;
        System.out.println("method2:val = "+val);

    }
    public static void method1(int val){

    }

    public static void show(){
        System.out.println("Hello method");
    }
}