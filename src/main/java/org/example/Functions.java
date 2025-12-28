package org.example;

import java.util.Scanner;

public class Functions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        Define two methods to print the maximum and the minimum number respectively
//        among three numbers entered by the user.
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int max=maximum(a,b,c);
//        int min=minimum(a,b,c);
//        System.out.println("max: "+max+", min: "+min);

        //   Define a program to find out whether a given number is even or odd.
//        int n=sc.nextInt();
//        String ans=evenOrOdd(n);
//        System.out.println(ans);

        //   A person is eligible to vote if his/her age is greater than or equal to 18.
        //   Define a method to find out if he/she is eligible to vote.
//        int age=sc.nextInt();
//        String ans=eligibleToVote(age);
//        System.out.println(ans);

        //   Write a program to print the sum of two numbers entered by user
        //   by defining your own method.
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int sum=summ(n,m);
//        System.out.println(sum);

        //   Define a method that returns the product of two numbers entered by user.
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int product=product(n,m);
//        System.out.println(product);

        //  Write a program to print the circumference
        //  and area of a circle of radius entered by user by defining your own method.
//        int r=sc.nextInt();
//        double circumference=circumference(r);
//        double area=area(r);
//        System.out.println("circumference: "+ circumference);
//        System.out.println("area: "+area);

        //   Define a method to find out if a number is prime or not.
//        int n=sc.nextInt();
//        boolean ans=isPrime(n);
//        System.out.println(ans);

        //   Factorial of a number
        int n=sc.nextInt();
        int ans=facorial(n);
        System.out.println(ans);

        //   Write a function to find if a number is a palindrome or not. Take number as parameter.
//        int n=sc.nextInt();
//        String ans=isPalindromeNum(n);
//        System.out.println(ans);

        //  Write a function to check if a given triplet is a Pythagorean triplet or not.
        //  (A Pythagorean triplet is when the sum of the square of two numbers is equal
        //  to the square of the third number).
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        String ans=isPathagorean(a,b,c);
//        System.out.println(ans);

        //   Write a function that returns all prime numbers between two given numbers.
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        printPrimes(a,b);

        //   Write a function that returns the sum of first n natural numbers.
//        int n=sc.nextInt();
//        int sum=sumOfNaturalNums(n);
//        System.out.println(sum);
    }

    public static int maximum(int a,int b,int c){
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        return max;
    }

    public static int minimum(int a,int b,int c){
        int min=a;
        if(b<min) min=b;
        if(c<min) min=c;
        return min;
    }

    public static String evenOrOdd(int n){
        if(n%2==0) return "Given number is even!!";
        return "Given number is odd!!";
    }

    public static String eligibleToVote(int n){
        if(n>=18) return "You are eligible to vote!!";
        return "You are not eligible to vote!!";
    }

    public static int summ(int n,int m){
        return n+m;
    }

    public static int product(int n,int m){
        return n*m;
    }

    public static double circumference(int r){
        return 2*Math.PI*r;
    }

    public static double area(int r){
        return Math.PI*r*r;
    }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int facorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static String isPalindromeNum(int n){
        int reverse=0;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }
        if(reverse==n) return "given number is a palindrome number!!";
        return "given number is not a palindrome number!!";
    }

    public static String isPathagorean(int a,int b,int c){
        if(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b) return " Given triplets are pathagorean triplets!!";
        return "Given triplets are not pathagorean triplets!!";
    }

    public static void printPrimes(int a,int b){
        for(int i=a;i<=b;i++){
            if(isPrime(i)) System.out.println(i);
        }
    }

    public static int sumOfNaturalNums(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

}
