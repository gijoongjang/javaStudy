package sort;

import java.util.Scanner;

/**
 * 이진탐색(BinarySearch)
 * 정렬 기반 알고리즘(무조건 정렬 상태여야함.)
 * 시간복잡도 -> O(nlogn)
 */
public class BinarySearch {

    public int binarySearch(int target, int[] arr) {
        int first = 0;
        int last = arr.length-1;
        int mid;

        while(first <= last) {
            mid = (first + last) / 2;

            if(arr[mid] == target) return mid;
            if(arr[mid] > target) {
                last = mid-1;
            } else {
                first = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 11, 13, 14, 16};

        Scanner s = new Scanner(System.in);

        int num = new BinarySearch().binarySearch(s.nextInt(), arr);

        if(num == -1) {
            System.out.print("찾는 숫자가 존재하지 않음");
        } else {
            System.out.print(String.format("%d번째 인덱스에 존재!", num));
        }
    }
}
