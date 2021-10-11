package com.greatlearning.driver;

import com.greatlearning.Bracketstack.BalancedBrackets;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your expression with brackets");
		String brackets = scan.nextLine();
		if(BalancedBrackets.checkingBalancedBrackets(brackets))
			System.out.println("Entered expression is balanced");
		else
			System.out.println("Entered expression is Unbalanced");
		scan.close();
		
		
	}

}
