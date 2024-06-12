package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_19_RockPaperScissor {
    
        public static void main(String[] args)
        {
            System.out.println("Enter 0: for rock \n Enter 1 : for paper : \n Enter 2 : for scissor ");
            int i=0;
            int c=0;
            int y=0;

            while(i<5)
            {
                Random rand = new Random();
                int comp = rand.nextInt(3);
                System.out.println("computer has entered :" +comp);

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter your choice :" );
                int your = sc.nextInt();
                System.out.println("you have entered : " +your);

                switch(comp)
                {
                    case 0:
                        switch (your) {
                            case 0:
                                System.out.println("match is tie ");
                                break;
                            case 1:
                                System.out.println("you have won");
                                y++;
                                break;
                            case 2:
                                System.out.println("computer have won");
                                c++;
                                break;
                            default:
                                System.out.println("you have entered invalid choice");
                        }
                        break;
                    case 1:
                        switch (your) {
                            case 0:
                                System.out.println("computer have won");
                                c++;
                                break;
                            case 1:
                                System.out.println("match is tie ");
                                break;
                            case 2:
                                System.out.println("you have won");
                                y++;
                                break;
                            default:
                                System.out.println("you have entered invalid choice");
                        }
                        break;
                    case 2:
                        switch (your)
                        {
                            case 0:
                                System.out.println("you have won");
                                y++;
                                break;
                            case 1:
                                System.out.println("computer have won ");
                                c++;
                                break;
                            case 2:
                                System.out.println("match is tie");
                                break;
                            default:
                                System.out.println("you have entered invalid choice");
                        }
                        break;
                }
                i++;

            }
            System.out.printf("match won by computer is %d and you is %d \n" ,c , y );

            if(c>y)
            {
                System.out.println("computer won the 5 match series");
            }
            else if(y>c)
            {
                System.out.println("you have won the 5 match series");
            }
            else
            {
                System.out.println("Series is Tie");
            }

        }

    }
