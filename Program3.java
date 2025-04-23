package com.guvi.task1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int i=sc.nextInt();
        
        if(i>0){
           System.out.println( "The given number is positive");
        }else if(i<0){
            System.out.println( "The given number is negative");
        }
   }

}
