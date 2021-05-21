package csi.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: count positive and negative numbers
 */

public class negativeOrPositive {

	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter number until zero");
		int number=input.nextInt();
		
		int countPositive=0;
		int countNegative=0;
		
		while(number!=0) {
			System.out.println("Please enter number until zero");
			
			
			if(input.hasNextInt()) {	
				number=input.nextInt();
				
				if(number>0) {
					countPositive++;
				}
				else if(number<0) {
					countNegative++;
				}
			}
			else {
				System.out.println("Please enter an int type from the console");
			}
		}
		
		double avgSum=(double)((countPositive+countNegative)/2);
		
		System.out.println("The number of positives is "+countPositive);
		System.out.println("The number of negatives is "+countNegative);
		System.out.println("The average betwen "+countPositive+" and "+countNegative+" is "+avgSum);
	}
}
