package org.temp;

import java.util.Scanner;

public class Temperature_calculator {
	public static void main(String[]args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Welcom to the Temperature Calculator");
		System.out.println("Enter C to convert celsius to fahrenheit");
		System.out.println("Enter F to convert fahrenheit to celsius");
		System.out.println("Enter the choice (C/F):"); 	
		char choice = s.next().charAt(0);
		
		if(choice=='c' || choice =='C') {
		 System.out.println("Enter the Temperature in Celcius:" );
		 double celsius=s.nextDouble();
		 double fahrenheit=(celsius*9/5)+32;
		 System.out.println("The fahrenheit is:" +fahrenheit+ "F");
		}
		 else if(choice=='f'||choice=='F'){
			 System.out.println("Enter the Temperature in Fahrenheir:");
			 double fahrenheit=s.nextDouble();
			 double celsius=(fahrenheit-32)*5/9;
			 System.out.println("The celcius is:" +celsius+ "C");			 
		 }
		 else {
			System.out.println("Invalid choice, Please select either C or F");
		}
		s.close();
		}
	}


