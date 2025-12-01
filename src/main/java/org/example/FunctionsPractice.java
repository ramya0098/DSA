package org.example;

import java.util.Scanner;

public class FunctionsPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //SUM OF TWO NUMBERS
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(sum(a,b));

        //SWAP 2 NUMBERS
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // swap(a,b);
        // System.out.println(a+" "+b); // ❌ will NOT swap!

        //PRIME NUMBER
        // int n=sc.nextInt();
        // System.out.println(isPrime(n));

        //Is Armstrong Number
        // int n=sc.nextInt();
        // System.out.println(isArmStrongNumber(n));

        //Print all 3 digit Armstrong Numbers
        // for(int i=100;i<1000;i++){
        //     if(isArmStrongNumber(i)){
        //         System.out.println(i);
        //     }
        // }
    }

    //SUM OF TWO NUMBERS
    public static int sum(int a, int b){
        return a + b;
    }

    //SWAP 2 NUMBERS (WON'T WORK for main variables)
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    //PRIME NUMBER
    public static boolean isPrime(int n){
        if (n <= 1) return false;

        int c = 2;
        while (c * c <= n){
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }

    //ARMSTRONG NUMBER
    public static boolean isArmStrongNumber(int n){
        int sum = 0;
        int value = n;

        while (value > 0){
            int rem = value % 10;
            sum += rem * rem * rem;
            value /= 10;
        }
        return n == sum;
    }
}
