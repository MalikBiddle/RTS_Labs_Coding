/*``1  Print the number of integers in an array
 * that are above the given input and the number
 * that are below, e.g. for the array
 * [1, 5, 2, 1, 10] with input 6, print
 * “above: 1, below: 4”.
 */

import java.util.Scanner;

class Problem1
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
		int[] problem_array = {1,5,2,1,10};
		int above_input = 0;
		int below_input = 0;
		
		
		int input = getUserInput();
		
		for(int element: problem_array)
		{
			if(element < input)
			{
				below_input++;
			}
			
			else if(element > input)
			{
				above_input++;
			}
		}
		System.out.println("Above: " + above_input + ", Below: " + below_input);
	}
}