package com.company;
import java.util.Scanner;

public class CWH_Ch4_PS4 {

    public static void main(String[] args) {
//        Question 1:
//        int a = 11;
//        if(a = 11){
//        }

        // Question 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Marks In Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter Your Marks In Chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter Your Marks Mn Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1 + m2 + m3) / 3.0f;
//        System.out.println("Your Overall Percentage Is : " + avg);
//        if (avg >= 40 && m1 > 33 && m2 > 33 && m3 > 33){
//            System.out.println("Congratulations, You Have Been Promoted.");
//        }
//        else{
//        System.out.println("Sorry, You Have Not Been Promoted! Please Try Again.");
//        }

        // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Income In Lakhs Per Annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income <= 2.5){
//            tax = tax + 0;
//        }
//        else if(income > 2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income > 5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income > 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The Total Tax Paid By The Employee Is : " + tax);

        // Question 4

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        // Question 5

//        System.out.println("Enter The Year");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//
//        if( year % 4 == 0){
//            System.out.println("It's A Leap Year");
//        }
//        else{
//            System.out.println("It's A Normal Year");
//        }

        // Question 6

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This Is An Organizational Website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This Is An Commercial Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This Is An Indian Website");
        }

    }

}
