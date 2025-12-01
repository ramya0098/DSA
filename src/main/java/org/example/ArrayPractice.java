package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //SWAP ARRAY INDEX ELEMENTS
        //int n=sc.nextInt();
        //int []arr=new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        //}
        //int index1=sc.nextInt();
        //int index2=sc.nextInt();
        //swap(arr,index1,index2);
        //System.out.println(Arrays.toString(arr));

        //MAXIMUM ELEMENT IN AN ARRAY
        //int n=sc.nextInt();
        //int arr[]=new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        // }
        //int ans=maximumElement(arr);
        //System.out.println(ans);

        //MAXIMUM ELEMENT IN A RANGE
        //int n=sc.nextInt();
        //int arr[]=new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        //}
        //int start=sc.nextInt();
        //int end=sc.nextInt();
        //int ans=maxInARange(arr,start,end);
        //System.out.println(ans);

        //REVERSE AN ARRAY
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static int maximumElement(int arr[]){
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    public static int maxInARange(int arr[],int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void reverseArray(int arr[]){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=arr[start];
            start++;
            end--;
        }
    }
}
