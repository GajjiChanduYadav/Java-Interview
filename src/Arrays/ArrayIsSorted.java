package Arrays;

public class ArrayIsSorted {
    public static void main (String[] args){

        int[] arr = {20,30,40,50,60};

        boolean isSorted = true;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is in sorted order");
        }
        else{
            System.out.println("Array is not sorted");
        }


    }
}
// If we dont know whether array is asc or des

//public class CheckArraySorted {
//
//    public static void main(String[] args) {
//
//        int[] arr = {5, 4, 3, 2, 1};
//
//        boolean ascending = true;
//        boolean descending = true;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            if (arr[i] > arr[i + 1]) {
//                ascending = false;
//            }
//
//            if (arr[i] < arr[i + 1]) {
//                descending = false;
//            }
//        }
//
//        if (ascending || descending) {
//            System.out.println("Array is sorted");
//        } else {
//            System.out.println("Array is not sorted");
//        }
//    }
//}
