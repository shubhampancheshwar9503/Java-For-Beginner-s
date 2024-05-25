package com.company;
import java.util.Scanner;

public class CWH_06_CBSEBoardPercentageCalculator {

    public static void main(String[] args) {

        System.out.println("Enter Your Marks Out Of 100");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Marks Of Subject PHYSICS");
        int phys = scan.nextInt();
        System.out.println("Enter The Marks Of Subject CHEMISTRY");
        int chem = scan.nextInt();
        System.out.println("Enter The Marks Of Subject MATHEMATICS");
        int math = scan.nextInt();
        System.out.println("Enter The Marks Of Subject ENGLISH");
        int eng = scan.nextInt();
        System.out.println("Enter The Marks Of Subject COMPUTER SCIENCE");
        int cs = scan.nextInt();

        int sum = phys + chem + math + eng + cs;
        float per = (sum * 100) / 500f;

        System.out.println("YOUR PERCENTAGE IS : " + per);
    }

}