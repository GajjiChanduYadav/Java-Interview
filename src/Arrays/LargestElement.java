package Arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] arr = {22, 33, 22, 33, 66, 55, 77, 66};

//        int max = Integer.MIN_VALUE;
//
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

        // SECOND LARGEST ELEMENT

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max ) { // arr[i}!= max, handles duplicate values
                secondMax=arr[i];
            }
        }
        System.out.println(max +" and "+ secondMax);

    }
}
