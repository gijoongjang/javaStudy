package sort;

public class BubbleSort {

    public static void Sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {	//정렬 후 마지막 원소 필요 x
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 3, 8, 7, 1, 9, 4};

        BubbleSort.Sort(arr);

        BubbleSort.printArray(arr);
    }
}

