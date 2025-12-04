package org.example;

import java.util.Scanner;

public class Patterns {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
//        pattern6(n);
//        pattern7(n);
//        pattern8(n);
//        pattern9(n);
//        pattern10(n);
//        pattern11(n);
//        pattern12(n);
//        pattern13(n);
//        pattern14(n);
//        pattern15(n);
//        pattern16(n);
//        pattern17(n);
//        pattern18(n);
//        pattern18V2P0(n);
//        pattern19(n);
//        pattern20(n);
//        pattern21(n);
//        pattern22(n);

        //........pattern23 not done...........//
//        pattern23(n);
//        pattern24(n);
//        pattern25(n);
//        pattern26(n);
        //.........pattern27 not done.........//
//        pattern27(n);
//        pattern28(n);
//        pattern29(n);
//        pattern30(n);
//        pattern31(n);
//        pattern32(n);
//        pattern33(n);
//        pattern34(n);
//        pattern35(n);
//        pattern36(n);
    }


    //Pattern1
       // ***
       // ***
       // ***
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern2
       //  *
       //  **
       //  ***
       //  ****
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern3
       // *****
       // ****
       // ***
       // **
       // *
    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern4
      // 1
      // 1 2
      // 1 2 3
      // 1 2 3 4
      // 1 2 3 4 5
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Pattern5
        //  *
        //  **
        //  ***
        //  ****
        //  *****
        //  ****
        //  ***
        //  **
        //  *
    public static void pattern5(int n){
        for(int i=1;i<2*n;i++){
            int noOfStars=(i>n)? (2*n-i):i;
            for(int j=0;j<noOfStars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern6
        //       *
        //      **
        //     ***
        //    ****
        //   *****
    public static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern7
       //   *****
       //    ****
       //     ***
       //      **
       //       *
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern8
        //       *
        //      ***
        //     *****
        //    *******
        //   *********
    public static void pattern8(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            count=count+2;
            System.out.println();
        }
    }

    //Pattern9
        // *********
        //  *******
        //   *****
        //    ***
        //     *
    public static void pattern9(int n){
        int count=2*n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            count=count-2;
            System.out.println();
        }
    }

    //Pattern10
        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
    public static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern11
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
    public static void pattern11(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern12
        //  * * * * *
        //   * * * *
        //    * * *
        //     * *
        //      *
        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
    public static void pattern12(int n){
        for(int i=0;i<2*n;i++){
            int spacesCount=(i<n)?i:(2*n-i-1);
            for(int j=0;j<spacesCount;j++){
                System.out.print(" ");
            }
            int starCount=(i<n)?(n-i):(i-n+1);
            for(int j=0;j<starCount;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern13
      //      *
      //     * *
      //    *   *
      //   *     *
      //  *********
    public static void pattern13(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                if(i==n-1){
                    System.out.print("*");
                }
                else if(j==0 || j==count-1){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            count+=2;
            System.out.println();
        }
    }

    //Pattern14
       //    *********
       //     *     *
       //      *   *
       //       * *
       //        *
    public static void pattern14(int n){
        int count=2*n-1;
      for(int i=0;i<n;i++){
          for(int j=0;j<i;j++){
              System.out.print(" ");
          }
          for(int j=i;j<count;j++){
              if(i==0) System.out.print("*");
              else if(j==i || j==count-i-1) System.out.print("*");
              else System.out.print(" ");
          }
          System.out.println();
      }
    }

    //Pattern15
        //     *
        //    * *
        //   *   *
        //  *     *
        //   *   *
        //    * *
        //     *
    public static void pattern15(int n){
        int total=2*n-1;
        int mid=total/2;

        for(int i=0;i<total;i++){
            //distance from middle
            int diff=Math.abs(mid-i);

            //leading spaces
            for(int j=0;j<diff;j++){
                System.out.print(" ");
            }
            //first star
            System.out.print("*");

            //inner space
            int inner=(mid-diff)*2-1;

            if(inner>=1){
                for(int j=0;j<inner;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern16
        //        1
        //       1 1
        //      1 2 1
        //     1 3 3 1
        //    1 4 6 4 1

    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    //Pattern17
        //     1
        //    212
        //   32123
        //  4321234
        //   32123
        //    212
        //     1
    public static void pattern17(int n){
        int total=2*n-1;
        int mid=total/2;
        int counter=1;
        for(int i=1;i<=total;i++){
            int diff=Math.abs(mid-i+1);
            for(int j=0;j<diff;j++){
                System.out.print(" ");
            }
           int row=(i<=n)?(i):(total-i+1);
            for(int j=row;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=row;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern18
        //      **********
        //      ****  ****
        //      ***    ***
        //      **      **
        //      *        *
        //      *        *
        //      **      **
        //      ***    ***
        //      ****  ****
        //      **********
    public static void pattern18(int n){
        int total=2*n;
        int count=0;
        int ans=1;
        for(int i=0;i<total;i++){
            if(i<n){
                for(int j=0;j<n-i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<count;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<n-i;j++){
                    System.out.print("*");
                }
                count+=2;
            }
            else{
                count-=2;
                for(int j=0;j<ans;j++){
                    System.out.print("*");
                }
                for(int j=0;j<count;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<ans;j++){
                    System.out.print("*");
                }
                ans++;
            }
            System.out.println();
        }
    }

    public static void pattern18V2P0(int n){
        int total = 2 * n;

        for (int i=0;i<total;i++) {
            // stars on each side
            int stars = (i < n) ? (n - i) : (i - n + 1);

            // spaces in the middle
            int spaces = 2 * (n - stars);

            // left stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //Pattern19
        //       *        *
        //       **      **
        //       ***    ***
        //       ****  ****
        //       **********
        //       ****  ****
        //       ***    ***
        //       **      **
        //       *        *
    public static void pattern19(int n){
        int total=2*n-1;
        for(int i=1;i<=total;i++){

            //stars
            int stars=(i<=n)?(i):(total-i+1);
            //spaces
            int spaces=Math.abs(2*(n-i));

            //left stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            // middle spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            //right stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern20
        //  ****
        //  *  *
        //  *  *
        //  *  *
        //  ****
    public static void pattern20(int n){
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++){
                if(i==0 || i==n-1 || j==0 || j==n-2){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Pattern21
        //   1
        //   2  3
        //   4  5  6
        //   7  8  9  10
        //   11 12 13 14 15
    public static void pattern21(int n){
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((num++)+" ");
            }
            System.out.println();
        }
    }

    //Pattern22
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
    public static void pattern22(int n){
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                if(num==0){
                    num=1;
                }
                else num=0;
            }
            System.out.println();
        }
    }

    //Pattern23
       //      *      *
      //     *   *  *   *
     //    *       *      *
    public static void pattern23(int n){}

    //Pattern24
       //       *        *
       //       **      **
       //       * *    * *
       //       *  *  *  *
       //       *   **   *
       //       *   **   *
       //       *  *  *  *
       //       * *    * *
       //       **      **
       //       *        *
    public static void pattern24(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j || i+j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Pattern25
       //     *****
       //    *   *
       //   *   *
       //  *   *
       // *****
    public static void pattern25(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Pattern26
        //1 1 1 1 1 1
        //2 2 2 2 2
        //3 3 3 3
        //4 4 4
        //5 5
        //6
    public static void pattern26(int n){
        int num=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }

    //Pattern27
       //1 2 3 4   17 18 19 20
       //  5 6 7   14 15 16
       //    8 9   12 13
       //      10  11
    public static void pattern27(int n){

    }

    //Pattern28
       //         *
       //        * *
       //       * * *
       //      * * * *
       //     * * * * *
       //      * * * *
       //       * * *
       //        * *
       //         *
    public static void pattern28(int n){
       int total=2*n-1;
       for(int i=0;i<total;i++){
           int spaces=(i<n)?(n-i-1):(i-n+1);
           for(int j=0;j<spaces;j++){
               System.out.print(" ");
           }
           int stars=(i<n)?(i+1):(2*n-i-1);
           for(int j=0;j<stars;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }

    //Pattern29
        //       *        *
        //       **      **
        //       ***    ***
        //       ****  ****
        //       **********
        //       ****  ****
        //       ***    ***
        //       **      **
        //       *        *
    public static void pattern29(int n){
        int total=2*n-1;
        int upperCount=2*n;
        int lowerCount=0;
        for(int i=0;i<total;i++){
            //left stars
            int stars=(i<n)?(i+1):(2*n-i-1);
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=(i<n)?(upperCount-=2):(lowerCount+=2);
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            // right stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern30
       //            1
       //          2 1 2
       //        3 2 1 2 3
       //      4 3 2 1 2 3 4
       //    5 4 3 2 1 2 3 4 5
    public static void pattern30(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Pattern31
        //         4 4 4 4 4 4 4
        //         4 3 3 3 3 3 4
        //         4 3 2 2 2 3 4
        //         4 3 2 1 2 3 4
        //         4 3 2 2 2 3 4
        //         4 3 3 3 3 3 4
        //         4 4 4 4 4 4 4
    public static void pattern31(int n){
        int originalN=n;
        n=2*n;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                int numAtIndex=originalN-Math.min(Math.min(i,j),Math.min(n-i-2,n-j-2));
                System.out.print(numAtIndex+" ");
            }
            System.out.println();
        }
    }

    //Pattern32
       //       E
       //       D E
       //       C D E
       //       B C D E
       //       A B C D E
    public static void pattern32(int n){
        char letter=(char) ('A'+n-1);
        for(int i=0;i<n;i++){
            char ch=(char) (letter-i);
            while(ch<=letter){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    //Pattern33
       //       a
       //       B c
       //       D e F
       //       g H i J
       //       k L m N o
    public static void pattern33(int n){
        char letter='a';
        boolean isLower=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(isLower){
                    System.out.print(letter);
                }
                else{
                    System.out.print(Character.toUpperCase(letter));
                }
                letter++;
                isLower=!isLower;
            }
            System.out.println();
        }
    }

    //Pattern34
       //       E D C B A
       //       D C B A
       //       C B A
       //       B A
       //       A
    public static void pattern34(int n){
        for(int i=0;i<n;i++){
            char letter=(char) ('A'+(n-i-1));
            for(int j=0;j<n-i;j++){
                System.out.print(letter--);
            }
            System.out.println();
        }
    }

    //Pattern35
       //       1      1
       //       12    21
       //       123  321
       //       12344321
    public static void pattern35(int n){

        int count=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            count-=2;
            System.out.println();
        }
    }

    //Pattern36
       //  1 1 1 1 1 1 1
       //  1 2 2 2 2 2 1
       //  1 2 3 3 3 2 1
       //  1 2 3 4 3 2 1
       //  1 2 3 3 3 2 1
       //  1 2 2 2 2 2 1
       //  1 1 1 1 1 1 1
    public static void pattern36(int n){
        n=2*n;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                int numAtIndex=Math.min(Math.min(i+1,j+1),Math.min(n-i-1,n-j-1));
                System.out.print(numAtIndex+" ");
            }
            System.out.println();
        }
    }

    //Pattern37
        // A
        // B C
        // D E F
        // G H I J
        // K L M N O
    public static void pattern37(int n){
        char letter='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(letter++);
            }
            System.out.println();
        }
    }
}
