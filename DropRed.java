package Game;

import java.util.Scanner;

public class DropRed extends Board
{ 
	public static Scanner scanner = new Scanner(System.in);
    
 	public static void dropRed()
    {   
 		int count=1;
 		if(Dropyellow.i>=3)
 		{
 			Dropyellow.c=Dropyellow.i%2;
	 		if(Dropyellow.c==1||Dropyellow.c==0)
	 		{
	 			if(Dropyellow.c==0)
	 			{
	 				Dropyellow.c=2;
	 			}
	 			System.out.println("Player" + Dropyellow.c +" Turn:Please enter a column number" + " \n ");
	 		}
	        
 		}
 		else
 		{
 			System.out.println("Player" + Dropyellow.i +" Turn:Please enter a column number" + " \n ");
 		}
 		
 		int inputColumnNumber = scanner.nextInt();
 		
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
	        	
	        	 Dropyellow.i++;
	             break; 
	             
	         }
	         else if(grid[last_row][inputColumnNumber]  == 'R' ||grid[last_row][inputColumnNumber]  == 'Y')
	         { 
	             if(grid[last_row-count][inputColumnNumber] == '_')
	             { 
	            	 grid[last_row - count][inputColumnNumber] = 'R';
	            	 Dropyellow.i++;
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
