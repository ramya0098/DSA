package org.example;

import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     //   Write a program to print whether a number is even or odd, also take input from the user.
//        int n=sc.nextInt();
//        String evenOrOdd=evenOrOdd(n);
//        System.out.println(evenOrOdd);

      //  Take name as input and print a greeting message for that particular name.
//        String name=sc.next();
//        String greeting=greetings(name);
//        System.out.println(greeting);

        //  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        int principle=sc.nextInt();
//        int time=sc.nextInt();
//        int rate=sc.nextInt();
//        int simpleInterest=simpleInterest(principle,time,rate);
//        System.out.println(simpleInterest);

        //   Take in two numbers and an operator (+, -, *, /)
        //   and calculate the value. (Use if conditions)
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        char operator=sc.next().charAt(0);
//        int ans=calci(a,b,operator);
//        System.out.println(ans);

        //   Take 2 numbers as input and print the largest number.
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int ans=largest(a,b);
//        System.out.println(ans);

        //    Input currency in rupees and output in USD.
//        int rupees=sc.nextInt();
//        double ans=usd(rupees);
//        System.out.println(ans);

        //    To calculate Fibonacci Series up to n numbers.
//        int n=sc.nextInt();
//       fibonacci(n);

        //    To find out whether the given String is Palindrome or not.
//        String str=sc.next();
//        String ans=palindrome(str);
//        System.out.println(ans);

        //   To find Armstrong Number between two given number.
        int a=sc.nextInt();
        int b=sc.nextInt();
        armStrong(a,b);

    }
         public static String evenOrOdd(int n){
        if(n%2==0) return "Even number";
        return "Odd number";
         }

         public static String greetings(String name){
        return "Hello "+name+" All the best for your preparation!";
         }

         public static int simpleInterest(int p,int t,int r){
        int SI=(p*t*r)/100;
        return SI;
         }

         public static int calci(int a, int b,char operator) {
        int ans=-1;
        if(operator=='+') ans=a+b;
        else if(operator=='-') ans=Math.abs(a-b);
        else if(operator=='*') ans=a*b;
        else if(operator=='/'){
            if(a>b) ans=a/b;
            else ans=b/a;
        }
        return ans;
         }

         public static int largest(int a,int b){
        int ans=0;
        if(a>b) ans=a;
        else ans=b;
        return ans;
         }

         public static double usd(int rupees){
        double ans=rupees*0.012;
        return ans;
         }

         public static void fibonacci(int n){
        int ans=0;
        int a=0;
        int b=1;
             System.out.println(a);
             System.out.println(b);
             for(int i=2;i<=n;i++){
                 int temp=b;
                 b=a+b;
                 a=temp;
                 System.out.println(b);
             }
         }

         public static String palindrome(String str){
        int left=0;
        int right=str.length()-1;
        boolean flag=true;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=false;
            }
            left++;
            right--;
        }
        if(flag==true) return "Given String is a Palindrome String!!";
        return "Given String is not a Palindrome String!!";
         }

         public static void armStrong(int a,int b){
        int temp=0;
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i<=b;i++){
            int ans=0;
            int store=i;
            int countDigits=0;
            int store1=i;
            while(store1>0){
                store1=store1/10;
                countDigits++;
            }
            while(store>9){
                int rem=store%10;
                ans+=Math.pow(rem,countDigits);
                store=store/10;
            }
            if(store<=9){
                ans+=Math.pow(store,countDigits);
            }
            if(ans==i) {
                System.out.println(ans);
            }
             }
         }

    }
