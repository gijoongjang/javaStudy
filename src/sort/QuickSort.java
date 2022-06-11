package sort;

/**
 * 퀵 정렬(QuickSort)
 * 평균, 최선 -> O(nlogn)
 * 최악 -> O(n^2)
 */
public class QuickSort {

    public void sort(int[] arr, int left, int right) {
        if(left >= right) return;

        int pivot = partition(arr, left, right);

        sort(arr, left, pivot-1);
        sort(arr, pivot+1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int start = left;
        int end = right;

        while(start < end) {
            while(arr[end] > pivot && start < end) end--;
            while(arr[start] <= pivot && start < end) start++;

            swap(arr, start, end);
        }

        swap(arr, left, start);

        return start;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 3, 8, 7, 1, 9, 4, 3};

        new QuickSort().sort(arr, 0, arr.length-1);

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
