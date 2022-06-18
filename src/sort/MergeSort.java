package sort;

/**
 * 분할 정복 알고리즘 기반
 * 시간복잡도 -> O(nlogn)
 * 안정적인 정렬
 * 추가적인 저장 요소가 필요하므로 메모리 사용률 높음
 */
public class MergeSort {

    public static void devideOrMerge(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left+right) / 2;
            devideOrMerge(arr, left, mid);		    //divide
            devideOrMerge(arr, mid+1, right);   //divide
            merge(arr, left, mid, right);		    //merge
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid+1;
        int k = left;

        int[] temp = new int[arr.length];

        while(i <= mid && j <= right) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        if(i > mid) {
            for(int a = j; a <= right; a++) {
                temp[k++] = arr[a];
            }

        } else {
            for(int a = i; a <= mid; a++) {
                temp[k++] = arr[a];
            }
        }

        //temp array copy
        for(int a = left; a <= right; a++) {
            arr[a] = temp[a];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 3, 4, 7, 9, 8, 2};

        devideOrMerge(arr, 0, arr.length-1);
        for(int n : arr) {
            System.out.print(n + " ");
        }

    }

}
