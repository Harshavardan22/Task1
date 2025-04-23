package com.guvi.task1;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 876, r = 0;
	    
	    while(i != 0) {
	    
	      int j = i % 10;
	      r = r * 10 + j;
	      i =i/ 10;
	    }

	    System.out.println("Reversed Number: " + r);

	}

}
