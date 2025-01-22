package Week6.Sorting;

public class MergeSortSample {

    private static void mergeSort(int l, int h, int[] arr) {
        if (l < h) {
            int m = (l + h) / 2;
            mergeSort(l, m, arr);
            mergeSort(m + 1, h, arr);
            merge(l, m, h, arr);
        }
    }

    private static void merge(int l, int m, int h, int[] arr) {
        int n1 = m - l + 1;
        int n2 = h - m;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[m + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 66, 3, 6 };
        mergeSort(0, arr.length - 1, arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
