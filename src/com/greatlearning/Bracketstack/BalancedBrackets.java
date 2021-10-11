package com.greatlearning.Bracketstack;

import java.util.Stack;

public class BalancedBrackets 
{
	public static boolean checkingBalancedBrackets(String brackets)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < brackets.length(); i++)
		{
			char character = brackets.charAt(i);
			if(character == '(' || character == '{' || character == '[')
				stack.push(character);
			if(stack.isEmpty())
				return false ;
			char localchar ;
			switch(character)
			{
			case '}' :
				localchar = stack.pop(); 
				if(localchar == '(' || localchar == '[')
					return false ;
				break;
			case ')' :
				localchar = stack.pop(); 
				if(localchar == '{' || localchar == '[') 
					return false ;
				break ;
			case ']' :
				localchar = stack.pop(); 
				if(localchar == '{' || localchar == '(') 
					return false ;
				break;			
			}
				
				
		}
		return stack.isEmpty() ;
		
	}

}
