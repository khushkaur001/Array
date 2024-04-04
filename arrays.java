package com.example.array;

public class arrays {

	public static void main(String[] args) {
		
		String[] fruit = {"apple","mango","banana","orange","kiwi"};
		
		System.out.println("fruit name is: " + fruit[3]);
		System.out.println("how many fruits in array: " + fruit.length);
	

	   int[]number = {1,2,3,4};
	  
	   System.out.println("number is: " + number[3]);
		
	   int[]somearray = new int[30];
	   somearray[0]= 20;
	   somearray[1]= 20;
	   somearray[2]= 20;
	   somearray[3]= 20;
	  
	   int[]somearray2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	   
	   System.out.println(somearray2[27]);
	}
}