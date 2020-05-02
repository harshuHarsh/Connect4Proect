package Game;

import java.util.Scanner;

public class Coin 
{
	public static Scanner scanner = new Scanner(System.in);
	static String option = scanner.nextLine(); 
	static char c =option.charAt(0);
	public static char returnCoin()
	{
		 
		
		if(c=='Y') 
		{
			 System.out.println("You have choosen Yellow to play first" + " " +c  + "\n"); 
		}
		else
		{
			System.out.println("You have choosen Red to play first" + " " +c  + "\n"); 
			
		}
	   
	    return c;
	}

}