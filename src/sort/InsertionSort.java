package sort;

/*
* 삽입정렬
* 정렬된 상태 시간복잡도 -> O(n)
* 평균, 최악 -> O(n^2)
* */
public class InsertionSort {

    public int[] sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] <= arr[j+1]) break;
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1, 7, 9, 8, 6};

        int[] sortedArr = new InsertionSort().sort(arr);

        for(int n : sortedArr) {
            System.out.print(n + " ");
        }
    }
}
