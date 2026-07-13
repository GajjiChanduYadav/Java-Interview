package Arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x=0;
        int k=2;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=k){
                arr[x]=arr[i];
                x=x+1;
            }
        }
        System.out.println(x);
        for(int i=0;i<x;i++){
            System.out.println(arr[x]);
        }
    }
}
