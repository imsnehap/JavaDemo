package DS.Sorting;
// Merge Sort has complexity O(nlogn)
public class MergeSort {

    //Complexity of this is O(nlogn)
    static void conqure(int arr[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] < arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];

        }
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }


    //Complexity of this is O(n)
    static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);

    }
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    public static void main(String[] args) {

        int input[] = {4, 2, 9, 2, 1};
        //Complexity of this sort is O(nlogn)
        MergeSort.divide(input, 0, input.length - 1);
        printArr(input);
    }
}
