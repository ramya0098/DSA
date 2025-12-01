package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    //best case time complexity of linear search is O(1);
    //worst case time complexity of linear search is O(n);
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //FIND AN ELEMENT IS EXISTS IN THE ARRAY OR NOT
        //int n=sc.nextInt();
        //int[] arr =new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        //}
        //int k=sc.nextInt();
        //boolean flag=isExists(arr,k);
        //System.out.println(flag);

        //SEARCH IN A STRING
        //String str=sc.next();
        //char c=sc.next().trim().charAt(0);
        //if(searchInString(str,c)) System.out.println("Element found");
        //else System.out.println("Element not found");

        //SEARCH IN A RANGE
        //int n=sc.nextInt();
        //int[] arr =new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        // }
        //int start=sc.nextInt();
        //int end=sc.nextInt();
        //int k=sc.nextInt();
        //int ans=searchInRange(arr,start,end,k);
        //System.out.println(ans);

        //FIND MINIMUM
        //int n=sc.nextInt();
        //int[] arr =new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        // }
        //int ans=findMinimum(arr);
        //System.out.println(ans);

        //SEARCH IN 2D ARRAY
        //int n=sc.nextInt();
        //int m=sc.nextInt();
        //int arr[][]=new int[n][m];
        //for(int i=0;i<n;i++){
        //    for(int j=0;j<m;j++){
        //        arr[i][j]=sc.nextInt();
        //    }
        //}
        //int target=sc.nextInt();
        //int ans[]=searchIn2DArray(arr,target);
        //System.out.println(Arrays.toString(ans));

        //COUNT NUMBER OF EVEN DIGIT NUMBERS
        //int n=sc.nextInt();
        //int[] arr =new int[n];
        //for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        // }
        //int ans=evenDigitNumbersCount(arr);
        //System.out.println(ans);

        //MAX WEALTH
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=maxWealth(arr);
        System.out.println(ans);
    }

    //FIND AN ELEMENT IS EXISTS IN THE ARRAY OR NOT
    public static boolean isExists(int arr[],int k){
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                flag=true;
                break;
            }
        }
        return flag;
    }

    //SEARCH IN A STRING
    public static boolean searchInString(String str,char c) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    //SEARCH IN A RANGE
    public static int searchInRange(int arr[],int start,int end,int target){
        int n=arr.length;
        for(int i=start;i<end;i++){
            if(arr[i]==target) return i;
        }
           return -1;
    }

    //FIND MINIMUM NUMBER
    public static int findMinimum(int arr[]){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    //SEARCH IN 2D ARRAY
    public static int[] searchIn2DArray(int arr[][],int target){
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              if(arr[i][j]==target){
                  return new int[]{i,j};
              }
          }
      }
        return new int []{-1,-1};
    }

    // COUNT NUMBER OF EVEN DIGIT NUMBERS
    public static int evenDigitNumbersCount(int arr[]){
        int n=arr.length;
        int count=0;
        for(int e:arr){
            if(digits(e)%2==0){
                count++;
            }
        }
        return count;
    }

    public static int digits(int n){
        if(n<0){
            n=n*(-1);
        }
        //shortcut for finding digits of a number
        // return (int)(Math.log10(num))+1

        int count=0;

        if(n==0){
            return 1;
        }
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    //MAX WEALTH (RICHEST CUSTOMER WEALTH-leetcode-1672)
    public static int maxWealth(int arr[][]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>ans) ans=sum;
        }
        return ans;
    }
}
