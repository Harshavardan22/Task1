package com.guvi.task1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int i=sc.nextInt();
        
        System.out.println(" The payable amount is : "+i);
        if(i<500){
            System.out.println("You don't have any discount for this purchase");
        }else if(i>=500 && i<=1000){
            System.out.println("you got 10% discount for this purchase");
        }else if(i>1000){
           System.out.println("you got 20% discount for this purchase");
        }
   }


}
