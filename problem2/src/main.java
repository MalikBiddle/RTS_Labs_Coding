/* #2  Rotate the characters in a string by a
 *  given input and have the overflow appear
 *   at the beginning, e.g. “MyString” 
 *   rotated by 2 is “ngMyStri”.
 */

import java.util.Scanner;

class Problem2
{
	public static int getUserInput() //Makes sure the user inputs an int
	{
		boolean valid_input = false;
		while(!valid_input)
		{
			try 
			{
				Scanner user_input = new Scanner(System.in);
				System.out.print("Enter number:");
				int input = user_input.nextInt(); //Will throw exception if not int
				
				valid_input = true;
				user_input.close();
				return input;
			}
			
			catch(Exception e)
			{
				System.out.println("Please enter an integer.\n");
			}	
		}
		
		return 0;
	}
	
	public static void main(String args[])
	{
		final String problem_string = "MyString";
		StringBuilder answer_string = new StringBuilder("");
		int shift_amt = getUserInput();

		if(shift_amt == 0) //If 0 no shift
		{
			System.out.println(problem_string);
		}
		
	
		
		if (shift_amt > 0) //>0 shift to the right
		{
			while(shift_amt > problem_string.length())
			{
				shift_amt = shift_amt - problem_string.length();
			}	
			
			for(int i = shift_amt; i > 0; i--) //Go from last element to be shifted to the end of string
			{
				answer_string.append(problem_string.charAt(problem_string.length()-(i))); //Add the elements to answer
			}
			
			for(int i = 0; i < problem_string.length()-shift_amt; i++) //Adds the rest of the characters
			{
				answer_string.append(problem_string.charAt(i));
			}
		}
		
		else //<0 shift to the left
		{
			shift_amt = Math.abs(shift_amt);
			
			while(shift_amt > problem_string.length())
			{
				shift_amt = shift_amt - problem_string.length();
			}	
			
			for(int i = shift_amt; i < problem_string.length(); i++) //Add all elements after the shift amount
			{
				answer_string.append(problem_string.charAt(i));
			}
			
			for(int i = 0; i < shift_amt; i++) //Add the rest of the characters
			{
				answer_string.append(problem_string.charAt(i));
			}
		}

		System.out.println(answer_string);		
	}

}