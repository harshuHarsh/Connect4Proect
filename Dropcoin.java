package Connect4;

import java.util.Scanner;

public class Dropcoin extends Board
{
	public static Scanner scanner = new Scanner(System.in);
	
 	public static void dropRed()
    {
        int count=1;
        System.out.println("Player 1 Turn:Please enter a column number" + " \n ");
        int inputColumnNumber = scanner.nextInt();
        boolean flag=true;
        while(true)
        {

	         if(inputColumnNumber > rows)
	         {
	                System.out.println("Invalid Column Selection");
	                break;
	               
	         }
	         if (grid[last_row][inputColumnNumber] == '_')
	         { 
	        	 grid[last_row][inputColumnNumber] = 'R';
	             break; 
	             
	         }
	         else if(grid[last_row][inputColumnNumber]  == 'R' ||grid[last_row][inputColumnNumber]  == 'Y')
	         { 
	             if(grid[last_row-count][inputColumnNumber] == '_')
	             { 
	            	 grid[last_row - count][inputColumnNumber] = 'R';
	                 break; 
	             }
	         }
	         count=count+1; 
	         if(count == rows)
	         { 
	             System.out.println("That column is full");
	             break;
	         }
         
        }
        printgrid();
         
    }
 	public static void dropYellow()
    {
        
        System.out.println("Player 2 Turn:Please enter a column number" + " \n ");
        
       
        int inputColumnNumber = scanner.nextInt();
        int count=1;
        while(true)
        {

	         if(inputColumnNumber > rows)
	         {
	                System.out.println("Invalid Column Selection");
	               
	         }
	         if (grid[last_row][inputColumnNumber] == '_')
	         { 
	        	 grid[last_row][inputColumnNumber] = 'Y';
	             break; 
	             
	         }
	         else if(grid[last_row][inputColumnNumber]  == 'R' ||grid[last_row][inputColumnNumber]  == 'Y')
	         { 
	             if(grid[last_row-count][inputColumnNumber] == '_')
	             { 
	            	 grid[last_row - count][inputColumnNumber] = 'Y';
	                 break; 
	             }
	         }
	         count=count+1; 
	         if(count == rows)
	         { 
	             System.out.println("That column is full");
	             break;
	         }
         
        }

    }
    

}
