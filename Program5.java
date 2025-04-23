package com.guvi.task1;

public class Program5 {
	public static void main(String[] args) {
        int i =5;
        int j =10;
        int k=2;
        
        if(i<=j && i<=k){
            System.out.println(" The smallest number is :"+i);
        }else if (j<=i && j<=k){
            System.out.println(" The smallest number is  :"+j);
        }else{
            System.out.println(" The smallest number is  :"+k);
        }
    }

}
