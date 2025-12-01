package org.example;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fruit= sc.next();

        //EXAMPLE 1
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

        //EXAMPLE 1
        //enhanced switch statement
        //shortcut key -->alt+enter
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");

        }

            //EXAMPLE 2
            int day=sc.nextInt();
            switch (day){
                case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thursday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
                default -> System.out.println("Invalid input");
            }

            //EXAMPLE 3
            switch (day){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Weekday");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
            }

            //EXAMPLE 3
            // enhanced statement
        switch (day){
                case 1,2,3,4,5 -> System.out.println("Weekday");
                case 6,7 -> System.out.println("Weekend");
        }

            //EXAMPLE 4
            //Nested Switch statement
            int empId=sc.nextInt();
            String department=sc.next();
            switch (empId){
                case 1:
                    System.out.println("Ramya Mutyam");
                    break;
                case 2:
                    System.out.println("Satish Kumar");
                    break;
                case 3:
                    switch (department){
                        case "IT":
                            System.out.println("Mamu");
                            break;
                        case "Development":
                            System.out.println("Chunchu");
                            break;
                        case "Mule":
                            System.out.println("Gundu");
                            break;
                        case "WebDeveloper":
                            System.out.println("Chunchi");
                            break;
                        default:
                            System.out.println("Invalid Department");
                    }
                default :
                    System.out.println("Invalid Id");
            }

    }
}
