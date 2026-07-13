package Arrays;


// left rotate array by one place
public class LeftRotate {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int n = arr.length;

//        int temp = arr[0];
//        for(int i =1;i< arr.length;i++){
//            arr[i-1]=arr[i];
//        }
//        arr[arr.length-1]= temp;
//
//        for(int i =0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //rotate array by d places

        int d = 3;


        System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Perform left rotation
        leftRotate(arr, n, d);

        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Function to perform left rotation by 'd' positions

    public static void leftRotate(int[] arr, int n, int d){
        // Step 1: Handle edge case - empty array
        if(n==0){
            System.out.println("Array is empty");
            return;
        }
        // Step 2: Handle case where d > n
        // Rotating by d or d % n gives the same result

        d= d%n;

        // Step 3: If d is 0, no rotation needed
        if(d==0){
            System.out.println("Rotation count is 0 or a multiple of array size. Array remains unchanged.");
            return;
        }

        // Step 4: Reverse the first 'd' elements
         reverse(arr,0,d-1);

        // Step 5: Reverse the remaining 'n-d' elements
        reverse(arr,d,n-1);

        // Step 6: Reverse the entire array
        reverse(arr,0,n-1);

    }
    // Function to reverse a portion of the array from index 'start' to 'end'
    public static void  reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}

//   LEFT ROTATION BY D PLACES
// reverse(arr, 0, d - 1);       // Reverse first d elements
//reverse(arr, d, n - 1);       // Reverse remaining n-d elements
//reverse(arr, 0, n - 1);       // Reverse the whole array


//    RIGTH ROTATION BY D PLACES
// reverse(arr, n - d, n - 1);   // Reverse last d elements
//reverse(arr, 0, n - d - 1);   // Reverse first n-d elements
//reverse(arr, 0, n - 1);       // Reverse the whole array