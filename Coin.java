package Connect4;

import java.util.Scanner;

public class Coin 
{
	public static Scanner scanner = new Scanner(System.in);
	public static char returnCoin()
	{
		String option = scanner.nextLine();  
		char c =option.charAt(0);
	    System.out.println("You have choosen Red to play first" + " " +c  + "\n"); 
	    return c;
	}

}
