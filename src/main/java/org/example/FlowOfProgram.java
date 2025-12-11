package org.example;

import java.util.Scanner;

public class FlowOfProgram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //leap year
        // int year=sc.nextInt();
        // String isLeapYear=isLeapYear(year);
        // System.out.println(isLeapYear);

        //sum of two numbers
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int ans=sum(a,b);
        // System.out.println(ans);

        //multiplication table of the given input
        // int n=sc.nextInt();
        // multiply(n);

        //find LCM and HCF of two given numbers
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int lcm=lcm(a,b);
        // int hcf=hcf(a,b);
        // System.out.println("LCM= "+lcm +", HCF= "+hcf);

        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        int sum=0;
        while(true){
            String input=sc.next();
            if(input.equals("x") || input.equals("X")){
                break;
            }
            else{
                int num=Integer.parseInt(input);
                sum=sum+num;
            }
        }
        System.out.println(sum);

    }

    //find the given year is leap year or not
    public static String isLeapYear(int year){
        String ans="";
        if(year%400==0){
            ans="Given year is a leap year!";
        }
        else if(year%4==0 && year%100!=0){
            ans="Given year is a leap year!";
        }
        else{
            ans="Given year is not a leap year!";
        }
        return ans;
    }

    //find sum od two numbers
    public static int sum(int a,int b){
        int ans=a+b;
        return ans;
    }

    //multiplication table of the given input
    public static void multiply(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+n+"= "+i*n);
        }
    }

    //LCM of 2 given numbers
    public static int lcm(int a,int b){
        int ans=a*b/hcf(a,b);
    return ans;
    }

    //HCF of 2 given numbers
    public static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }


}
