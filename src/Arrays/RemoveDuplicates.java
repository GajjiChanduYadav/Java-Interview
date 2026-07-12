package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {22, 22, 33, 33, 44, 55}; // 2 pointer approach is used when array is sorted
//        int x=0;
//
//        for(int i = 1; i<arr.length;i++){
//            if(arr[i]!=arr[i-1]){
//                x=x+1;
//                arr[x]=arr[i];
//
//            }
//        }
//        System.out.println(x+1); // no.of unique elements
//
//        for(int i=0;i<x+1;i++){  // print unique elements
//            System.out.println(arr[i]);
//        }

        // if array is not in sorted order we can go with set optimal solution for duplicates

//        Set<Integer> set = new HashSet<>();
//
//        for(int num : arr){
//            set.add(num);
//        }
//        System.out.println(set);


        // IF THE ASK TO PRINT DUPLICATE ELEMENTS MEANS USE HASHMAP

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }


}
