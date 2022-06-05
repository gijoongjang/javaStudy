package sort;

public class SelectionSort {

    public void Sort(int[] arr) {
        int min;
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 2, 4, 7, 1, 6};

        new SelectionSort().Sort(arr);
    }
}

