import java.util.Scanner;

public class problem0414 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a Letter Grade!");
		Scanner key = new Scanner(System.in);
		char letter = key.next().charAt(0);
		letter = Character.toUpperCase(letter);
		if(letter == 'A')
		{
			System.out.println("The number grade is 4");
		}
		else if(letter == 'B')
		{
			System.out.println("The number grade is 3");
		}
		else if(letter == 'C')
		{
			System.out.println("The number grade is 2");
		}
		else if(letter == 'D')
		{
			System.out.println("The number grade is 1");
		}
		else if(letter == 'F')
		{
			System.out.println("The number grade is 0");
		}
		else
		{
			System.out.println("Error! Invalid Input!");
		}
	}

}
