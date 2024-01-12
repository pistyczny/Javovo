import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            int[] tab = null;
        }

        {
            int val;

            int[] arr = new int[200];

            System.out.println(arr[5]);

            String[] tab = new String[50];
            System.out.println(tab[0]);

            int[] tablica = { 1, 5, 8, 3, 0, 2};
//            int[] tablica1 = new int[0]; // logic error
            System.out.println(tablica[0]);
        }

        {
            int[] tab = null;

            tab = new int[10];
        }

        {
            String[] tab = {null};
        }

        {
            int[] tab = new int[25];
            tab[0] = 1000;
//            tab[11] = 567;

            System.out.println(tab.length);
        }

        {
            int[] arr = new int[100];

            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i]+", ");
            System.out.println();

            for(int i=0; i< arr.length; i++)
                arr[i] = (int)(Math.random()*100);

            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i]+", ");
            System.out.println();

            for(int val : arr)
                val = 0;

            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i]+", ");
            System.out.println();
        }

        {
            enum Animal{ CAT, DOG}

            Animal[] arr = { Animal.CAT, Animal.DOG};

            System.out.println(
                Arrays.toString(arr)
            );

            for(Animal animal : arr)
                animal = Animal.CAT;

            System.out.println(
                Arrays.toString(arr)
            );

            
        }
        
    }
}