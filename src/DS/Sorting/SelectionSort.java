package DS.Sorting;

public class SelectionSort {


    //Complexity of this is O(n^2)
    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length -1; i++) {
            int smallest = i;

            for (int j = i+1; j < arr.length; j++) {
                if (  arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {

        int input[] = {4, 2, 9, 2, 1};
        SelectionSort.selectionSort(input);
        printArr(input);

    }
}
