import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        int i = 10;
        i = i++;
        System.out.println(i);
        i = ++i;
        System.out.println(i);
        i = i++ + ++i;
        System.out.println(i);
        i = (i++ + ++i) + i++;
//           (11 + 13 i==13) + 13 i==14
        System.out.println(i);*/
        {
            int[] tab = { 10, 20, 30};
            int searchFor = 20;

            for(int i=0; i< tab.length; i++)
                if(tab[i] == searchFor)
                    System.out.println("found "+searchFor+" @ index "+i);

            for(int val : tab)
                System.out.println(val);
        }
        {
            // wypełnianie tablicy wartościami wprowadzanymi z klawiatury
            int[] arr = new int[3];
            int fill = 0;

            System.out.print("[");
            for(int i=0; i< arr.length; i++)
                System.out.print(arr[i]+" ");
            System.out.println("]");

            Scanner scanner = new Scanner(System.in);
            int tmp;

            while((tmp = scanner.nextInt()) != -1 && fill < arr.length){
                arr[fill++] = tmp;
            }

            System.out.print("[");
            for(int i=0; i< arr.length; i++)
                System.out.print(arr[i]+" ");
            System.out.println("]");

            // powiększenie ilości elementów tablicy przez alokację nowej tablicy

            while((tmp = scanner.nextInt()) != -1){
                if(fill >= arr.length){
                    int[] tmpArr = new int[arr.length*2];
                    for(int i=0; i<arr.length; i++)
                        tmpArr[i] = arr[i];
                    arr = tmpArr;
                }
                arr[fill++] = tmp;

                System.out.print("[");
                for(int i=0; i< arr.length; i++)
                    System.out.print(arr[i]+" ");
                System.out.println("]");
            }



        }

        {
            // usuwanie elementu na zadanym indeksie tablicy
            int[] tab = {10, 20, 30, 40, 50, 60};
            int fill = 6;

            int indexToDel = 2;

            for(int i = indexToDel; i < fill-1; i++)
                tab[i] = tab[i+1];
            fill--;
            System.out.print("[");
            for(int i=0; i< tab.length; i++)
                System.out.print(tab[i]+" ");
            System.out.println("]");

            // =============================

            // wstawianie elementu pomiędzy elementy tablicy
            int addAtIndex = 1;
            int addValue = 18;
            for(int i = fill; i > addAtIndex; i--){
                tab[i] = tab[i-1];
            }
            tab[addAtIndex] = addValue;
            System.out.print("[");
            for(int i=0; i< tab.length; i++)
                System.out.print(tab[i]+" ");
            System.out.println("]");
        }
    }
}