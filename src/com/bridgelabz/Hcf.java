package com.bridgelabz;
import java.util.Scanner;


public class Hcf {


    public static void main(String[] args) {
int hcf =0 ;
        System.out.println("********************************************");
        System.out.println(" Welcome to HCF Program....");   //Printing Welcome Meassage
        System.out.println("********************************************");

        System.out.println("Enter A Number 1 --->"); // taking input from user
        Scanner sc = new Scanner(System.in); // creating a scanner object
        int num1 = sc.nextInt();
        System.out.println("Enter A Number 2 --->"); // taking input from user
        int num2 = sc.nextInt();


         for (int i = 1; i <= num1 || i <= num2; i++)  //Finding the hcf using OR operator
        {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.println("The HCF Of "+num1+" And "+num2+" Is = "+hcf);
    }
}

