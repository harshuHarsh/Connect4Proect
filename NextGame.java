package Game;

import java.util.Scanner;

public class NextGame 
{
	
	
	
	 public static void anotherGame(char c2)
	    {
	    	
	    	
			CheckYellowWin.flag=true;
			CheckRedWin.flag=true;
	    	System.out.println("Do you want to play  game, Please Type Yes or No (for yes and NO)"+"\n");
	    	Scanner scanner = new Scanner(System.in);
	    	String option = scanner.nextLine(); 
	    	char c1 =option.charAt(0);
	    	
	    	if(c1=='Y')
	    	{
	    		new Connect4();
	    	}
	    	else
	    	{
	    		if(c2=='R')
	    		{
		    		System.out.println("Total games won" + " " +Connect4.wincount1);
		    		System.exit(0);
	    		}
	    		else
	    		{
	    			System.out.println("Total games won" + " " +Connect4.wincount);
	        		System.exit(0);
	    			
	    		}
	    		
	    		
	    	}
	    	
	    }

}
