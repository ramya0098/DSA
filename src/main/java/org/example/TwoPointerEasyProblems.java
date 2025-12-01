package org.example;

import java.util.*;

public class TwoPointerEasyProblems {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
    }
    // REVERSE AN ARRAY
    //    reverseArray(arr);
    //    System.out.println(Arrays.toString(arr));

    //   REMOVE AN ELEMENT
    //   int val=sc.nextInt();
    //   int ans=removeElement(arr,val);
    //   System.out.println(ans);

     // MOVE ZEROS TO END
     //  moveZerosToEnd(arr);
     //  System.out.println(Arrays.toString(arr));

      //REMOVE DUPLICATES FROM SORTED ARRAY(return unique value count)
       // int ans=removeDuplicatesFromSortedArray(arr);
       //  System.out.println(ans);

      //PALINDROME OR NOT(array)
      //  String ans=isPalindrome(arr);
       // System.out.println(ans);

      //MERGE 2 SORTED ARRAYS (use another array to store new merged array)
       //  int m=sc.nextInt();
       // int arr2[]=new int[m];
       // for(int i=0;i<m;i++){
       // arr2[i]=sc.nextInt();}
       // int ans[]=mergeTwoSortedArrays(arr,arr2);
       //System.out.println(Arrays.toString(ans));

      //MERGE 2 SORTED ARRAYS (Extra space in one array)
        // int m=sc.nextInt();
        //int arr2[]=new int[m];
        //for(int i=0;i<m;i++){
        //arr2[i]=sc.nextInt();}
        //mergeTwoArraysInPlace(arr,arr2);
        //System.out.println(arr);

       //INTERSECTION OF 2 SORTED ARRAYS(Common elements of two arrays)
        //int m=sc.nextInt();
        //int arr2[]=new int[m];
        //for(int i=0;i<m;i++){
        //    arr2[i]=sc.nextInt();
        //}
        //List<Integer> ans=intersectionOftwoArrays(arr,arr2);
        //System.out.println(ans);

        //PAIR SUM
        //int val=sc.nextInt();
        //int ans[]=pairSum(arr,val);
        //System.out.println(Arrays.toString(ans));

        //SORTED SQUARED ARRAY
        //int ans[]=sortedSquaredArray(arr);
        //System.out.println(Arrays.toString(ans));

        //PAIR DIFFERENCE
        //int k=sc.nextInt();
        //int ans[]=pairDiff(arr,k);
        //System.out.println(Arrays.toString(ans));

        //TWO SUM II
        //int k=sc.nextInt();
        //int ans[]=twoSumTwo(arr,k);
        //System.out.println(Arrays.toString(ans));

        //TWO SUM (IF THE ARRAY IS UNSORTED)
        //int k=sc.nextInt();
        //int ans[]=twoSumUA(arr,k);
        //System.out.println(Arrays.toString(ans));

        //3 SUM
        //List<List<Integer>> ans=threeSum(arr);
        //System.out.println(ans);

        //3Sum CLOSEST
        //int target=sc.nextInt();
        //int ans=threeSumClosest(arr,target);
        //System.out.println(ans);

        //4SUM
        //int target=sc.nextInt();
        //List<List<Integer>> result=fourSum(arr,target);
        //System.out.println(result);

        //CONTAINER WITH MOST WATER
        //int ans[]=containerWithMostWater(arr);
        //System.out.println(Arrays.toString(ans));

    }
//    reverse an array
    public static void reverseArray(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        boolean flag;
       while(left<right) {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
       }
    }
//    remove an element(in-place) arr, val
    public static int removeElement(int arr[],int val){
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        return k;
    }
//    move zeros to end
    public static void moveZerosToEnd(int arr[]){
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        while(k<n){
            arr[k]=0;
            k++;
        }
    }
//    remove duplicates from sorted array
    public static int removeDuplicatesFromSortedArray(int arr[]){
        int n=arr.length;
        int j=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }

//    check if array is palindrome
    public static String isPalindrome(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right) {
            if (arr[left] != arr[right]) {
                return "Given array is not a Palindrome";
            }
            left++;
            right--;
        }
            return "Given array is a palindrome";
    }

//   merge 2 sorted arrays
    public static int[] mergeTwoSortedArrays(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int ansArr[]=new int [m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ansArr[k++]=arr1[i++];
            }
            if(arr1[i]>arr2[j]){
                ansArr[k++]=arr2[j++];
            }
        }
        while(i<n){
            ansArr[k++]=arr1[i++];
        }
        while(j<m){
            ansArr[k++]=arr2[j++];
        }

        return ansArr;
    }

//    merge 2 sorted Arrays Extra space in one array (Merge another array in that space)
    public static void mergeTwoArraysInPlace(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int i=n-1;
        int j=m-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                k--;
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
                k--;
            }
        }
        while(j<0){
            arr1[k]=arr2[j];
            j--;
            k--;
        }
    }

//    Intersection of two sorted arrays (two-sum style)(common elements of two arrays)
    public static List intersectionOftwoArrays(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            if(arr1[i]>arr2[j]){
                j++;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
        }
        return ans;
    }

//    Pair sum in sorted array (find pair with given sum)
    public static int[] pairSum(int[] arr,int val){
        int ans[]=new int[2];
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right) {
            int sum=arr[left] + arr[right];
            if (sum == val) {
                ans[0] = left;
                ans[1] = right;
                return ans;
            }
           else if (sum > val) {
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }

//    Sorted squared array (two-pointer from ends after squaring negatives)
    public static int[] sortedSquaredArray(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        int left=0;
        int right=n-1;
        int position=n-1;
        while(left<right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[position]=arr[left]*arr[left];
                position--;
                left++;
            }
            else{
                ans[position]=arr[right]*arr[right];
                position--;
                right--;
            }
        }
        return ans;
    }

//    Check if there exists two elements with difference k (sorted + two pointers)
    public static int[] pairDiff(int arr[],int k){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int diff=arr[right]-arr[left];
            if(diff==k){
                return new int[]{arr[left],arr[right]};
            }
            else if(diff>k){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{0,0};
    }

    //MEDIUM LEVEL
//    Two sum II - input array is sorted
    public static int[] twoSumTwo(int arr[],int k){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==k){
                return new int[]{left+1,right+1};
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }

//    Two sum If the Array is unsorted
    public static int [] twoSumUA(int arr[],int k){
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=k-arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

//    3Sum (sort + two-pointer for the inner pair)==> a+b+c=0
    public static List<List<Integer>> threeSum(int arr[]){
        int n=arr.length;
        List<List<Integer>> result=new ArrayList<>();
        if(arr.length<3 || arr==null) return result;

        Arrays.sort(arr);

        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;

            int target=-arr[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==target){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1]) left++;
                    while(left<right && arr[right]==arr[right+1]) right--;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }

//    3 pointer closest
    public static int threeSumClosest(int arr[],int target){

        if(arr.length<3 || arr==null){
            throw new IllegalArgumentException("Array should have atleast 3 numbers");
        }
        Arrays.sort(arr);
        int n=arr.length;
        int closestSum=arr[0]+arr[1]+arr[2];
        for(int i=0;i<n-2;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
                    closestSum=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if (sum>target) {
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return closestSum;
    }

//    4Sum (sort + nested two-pointer)
    public static List<List<Integer>> fourSum(int arr[],int target){
        if(arr.length<4 || arr==null){
            throw new IllegalArgumentException("Array shoulld have atleast 4 numbers");
        }
        List<List<Integer>> result=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;

                int left=j+1;
                int right=n-1;
                long twoSumTarget=target-arr[i]-arr[j];
                while(left<right){
                    int sumLR=arr[left]+arr[right];
                    if(sumLR==twoSumTarget){
                        result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;
                        while(left<right && arr[left]==arr[left-1]) left++;
                        while(left<right && arr[right]== arr[right+1]) right--;
                    }
                    else if(sumLR>twoSumTarget){
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }
        return result;
    }

//    Container with most water
    public static int[] containerWithMostWater(int heights[]) {
        int n = heights.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        int leftIndex = 0;
        int rightIndex = n - 1;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int area = height * (right - left);
            if (area > max) {
                max = area;
                leftIndex = left;
                rightIndex = right;
            }
            if (heights[left] > heights[right]) right--;
            else left++;
        }
        return new int[]{max, leftIndex, rightIndex};
    }

//    
}
