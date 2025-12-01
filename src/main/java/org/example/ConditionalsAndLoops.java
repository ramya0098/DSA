package org.example;

import java.util.Scanner;

public class ConditionalsAndLoops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //FIND MAX
        //int a=sc.nextInt();
        //int b=sc.nextInt();
        //int c=sc.nextInt();
        //int ans=FindMax(a,b,c);
        //System.out.println(ans);

        //CASE CHECK
        //char ch=sc.next().trim().charAt(0);
        //String ans=caseCheck(ch);
        //System.out.println(ans);

        //FIBONACCI NUMBER
        //int n=sc.nextInt();
        //int ans=fibonacciNum(n);
        //System.out.println(ans);

        //COUNT OCCURRENCES
        //int n=sc.nextInt();
        //int k=sc.nextInt();
        //int ans=countOccurrences(n,k);
        //System.out.println(ans);

        //REVERSE THE NUMBER
        //int n=sc.nextInt();
        //int ans=reverseNumber(n);
        //System.out.println(ans);
        
        //CALCULATOR PROGRAM
        calculator();
    }

    public static int FindMax(int a,int b,int c){
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        return max;
    }

    public static String caseCheck(char c){
        String ans="";
        if(c>='a' && c<='z'){
            ans="Lower case";
        }
        else{
            ans="Upper case";
        }
        return ans;
    }

    public static int fibonacciNum(int n){
        int prev=0;
        int i=1;

        int count=2;
        while(count<=n){
            int temp=i;
            i=prev+i;
            prev=temp;
            count++;
        }
        return i;
    }

    public static int countOccurrences(int n,int k){
        int ans=0;
        while(n>0){
            int rem=n%10;
            if(rem==k) ans++;
            n=n/10;
        }
        return ans;

    }

    public static int reverseNumber(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }
    
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true) {
            System.out.println("Enter the first value ");
            int a = sc.nextInt();
            System.out.println("Enter the second value");
            int b = sc.nextInt();

            System.out.println("Enter the operator");
            char c = sc.next().trim().charAt(0);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                if(c=='+'){
                    ans=a+b;
                }
                else if(c=='-'){
                    ans=a-b;
                }
                else if(c=='*'){
                    ans=a*b;
                }
                else if(c=='/'){
                    if(b!=0){
                        ans=a/b;
                    }
                }
                else if(c=='%'){
                    if(b!=0){
                        ans=a%b;
                    }
                }
            } else if (c == 'X' || c == 'x') {
                break;
            } else {
                System.out.println("Invalid operator");
                break;
            }
            System.out.println(ans);
        }
    }
}
