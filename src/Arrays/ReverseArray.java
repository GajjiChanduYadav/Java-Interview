package Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {22, 33, 22, 33, 66, 55, 77, 66};

        for(int i =0; i< arr.length/2;i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("reversed array");

        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
