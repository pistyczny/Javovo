public
    class Main {

    public static void main(String[] args) {
//        {
//            int[] tab = new int[25];
//
//            for(int i=0; i< tab.length; i++)
//                tab[i] = (int)(Math.random()*40);
//
//            System.out.print("[");
//            for(int val : tab)
//                System.out.print(val+" ");
//            System.out.println("]");
//
//            /*int minValueIndex = 0;
//            for(int j = minValueIndex + 1; j < tab.length; j++)
//                if(tab[minValueIndex] > tab[j])
//                    minValueIndex = j;
//
//            int tmp = tab[minValueIndex];
//            tab[minValueIndex] = tab[0];
//            tab[0] = tmp;
//
//            System.out.print("[");
//            for(int val : tab)
//                System.out.print(val+" ");
//            System.out.println("]");
//
//            minValueIndex = 1;
//            for(int j = minValueIndex + 1; j < tab.length; j++)
//                if(tab[minValueIndex] > tab[j])
//                    minValueIndex = j;
//
//            tmp = tab[minValueIndex];
//            tab[minValueIndex] = tab[1];
//            tab[1] = tmp;
//
//            System.out.print("[");
//            for(int val : tab)
//                System.out.print(val+" ");
//            System.out.println("]");
//            */
//
//            /*for(int i=0; i< tab.length-1; i++) {
//                int minValueIndex = i;
//                for (int j = minValueIndex + 1; j < tab.length; j++)
//                    if (tab[minValueIndex] > tab[j])
//                        minValueIndex = j;
//
//                int tmp = tab[minValueIndex];
//                tab[minValueIndex] = tab[i];
//                tab[i] = tmp;
//            }
//            System.out.print("[");
//            for (int val : tab)
//                System.out.print(val + " ");
//            System.out.println("]");
//            */
//
//            boolean anyChanges;
//            do {
//                anyChanges = false;
//                int currIndex = 0;
//                while (currIndex < tab.length - 1) {
//                    if (tab[currIndex] > tab[currIndex + 1]) {
//                        int tmp = tab[currIndex];
//                        tab[currIndex] = tab[currIndex + 1];
//                        tab[currIndex + 1] = tmp;
//                        anyChanges = true;
//                    }
//                    currIndex++;
//                }
//                System.out.print("[");
//                for (int val : tab)
//                    System.out.print(val + " ");
//                System.out.println("]");
//            }while(anyChanges);
//        }

        {
            int[] data1 = {10, 30, 50, 80, 100};
            int[] data2 = {25, 35, 110, 180, 200};

            int[] resData = new int[data1.length+data2.length];

            int indexD1 = 0,
                indexD2 = 0,
                indexRes = 0;

            while(indexD1 < data1.length && indexD2 < data2.length){
                if(data1[indexD1] < data2[indexD2])
                    resData[indexRes++] = data1[indexD1++];
                else
                    resData[indexRes++] = data2[indexD2++];
            }

            if(indexD1 < data1.length)
                while(indexD1 < data1.length)
                    resData[indexRes++] = data1[indexD1++];
            else
                while(indexD2 < data2.length)
                    resData[indexRes++] = data2[indexD2++];


            System.out.print("[");
            for(int val : resData)
                System.out.print(val+" ");
            System.out.println("]");

        }


        {
            int val[];
            int[] tab[];
            int[][] arr;


            int[] data1 = {10, 30, 50, 80, 100};
            int[] data2 = {25, 35, 110, 180, 200};

            tab = new int[][]{ data1, data2};

            for(int i=0; i<tab.length; i++){
                for(int j=0; j<tab[i].length; j++)
                    System.out.print("["+i+"]["+j+"]:\t"+tab[i][j]);
                System.out.println();
            }

            int[][] arr1 = new int[5][6];
            int[] arr2[] = new int[6][5];

            int[][] arr3 = new int[6][];

        }

        {
            int[][] arr = new int[][]{
                { 10, 20, 30},
                { 40, 50, 60, 70},
                { 80, 90,100,110,120}
            };
        }
    }
}