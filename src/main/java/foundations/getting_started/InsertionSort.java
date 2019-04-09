package foundations.getting_started;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,2,4,6,1,3};
        System.out.println("initial array: " + Arrays.toString(array));

        for (int index = 1; index < array.length; index++) {
            int key = array[index];

            //Insert array[index] into the sorted sequence array[1..index -1]
            int sort = index - 1;
            while (sort >= 0 && array[sort] > key ) {
                array[sort + 1] = array[sort];
                sort = sort - 1;
            }
            array[sort + 1] = key;
        }

        System.out.println("sorted array: "+ Arrays.toString(array));
    }
}
