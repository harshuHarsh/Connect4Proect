package Connect4;

import java.util.Scanner;

public class Connect4
{
    private static final int rows = 6;
    private static final int columns = 6;
    private static char[][] grid = new char[rows][columns];
    private boolean win=true;

    public static Scanner scanner = new Scanner(System.in);

     
    
    public static void main(String[] args)
    {
    	System.out.println("Select one from 1 - 6 to drop your coin"+"\n");
        Creategrid();
        printgrid();
        System.out.println("Please Choose one color between Red and yellow-Type in R or Y: ");
       
        String option = scanner.nextLine();   
        char c =option.charAt(0);
        System.out.println("You have choosen Red to play first" + " " +c  + "\n"); 
      
        printgrid();
        dropRed();
       
        
        
    }
    public static void dropRed()
    {
        
        System.out.println("Player 1 Turn:Please enter a column number" + " \n ");
        
       
        int inputColumnNumber = scanner.nextInt();

         if(inputColumnNumber > rows)
         {
                System.out.println("Invalid Column Selection");
               
         }
    }
    
    public static void Creategrid()
    {
        
        for (int i = 0; i<rows; i = i+1) 
        {
            for (int j = 0; j<columns; j = j+1)
            {

                grid[i][j] = '_';
                
                
            }
        }
    }

	public static void printgrid() 
	{
	 
		for (int i = 0; i<rows; i = i+1) 
		{
			for (int j = 0; j<columns; j = j+1)
			 {
				
					
					System.out.print(grid[i][j] +" "+ "|" + "   ");
					
			  }
			 System.out.println("\n");
	    }
		System.out.println("\n");
	}
	
}