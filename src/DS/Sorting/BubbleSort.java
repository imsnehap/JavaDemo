package DS.Sorting;

import java.util.Arrays;

public class BubbleSort {

    //Complexity of this is O(n^2)

    static void bubblesort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {

        int input[] = {4, 2, 9, 2, 1};
        BubbleSort.bubblesort(input);
        printArr(input);

    }
}
