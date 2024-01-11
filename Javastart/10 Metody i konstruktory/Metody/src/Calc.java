public class Calc {

    //typ_zwracany nazwaMetody(opcjonalne_parametry) { }

    int addTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
            // return a + b;
    }
    void  addAndPrint(int x, int y) {
            int sum = addTwoNumbers(x, y);
        System.out.println(sum);
    }
}
