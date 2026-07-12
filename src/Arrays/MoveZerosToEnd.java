package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] arr = {22, 0, 22, 0, 66, 0, 0, 66};

        int x =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[x]=arr[i];
                x++;

            }
        }
        for(int i =x;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
