package Arrays;
import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 5, 7, 8};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];

            }

        }
        // If arr2 is exhausted first, copy remaining elements from arr1
        while(i<arr1.length){
            merged[k++]=arr1[i++];
        }
        // If arr1 is exhausted first, copy remaining elements from arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(merged));
    }
}
