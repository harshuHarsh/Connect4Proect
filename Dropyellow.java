package Game;

import java.util.Scanner;

public class Dropyellow extends Board
{
	public static Scanner scanner = new Scanner(System.in);
	static int i=1;
	
	static int c=0; 
	

 	public static void dropYellow()
    {  
 		
 		int count=1;
 		
 		if(i>=3)
 		{
	 		c=i%2;
	 		if(c==1||c==0)
	 		{
	 			if(c==0)
	 			{
	 				c=2;
	 			}
	 			System.out.println("Player" + c +" Turn:Please enter a column number" + " \n ");
	 		}
	        
 		}
 		else
 		{
 			System.out.println("Player" + i +" Turn:Please enter a column number" + " \n ");
 		}
 		int inputColumnNumber = scanner.nextInt();       
       
        while(true)
        {
        	
	         if(inputColumnNumber > rows)
	         {
	                System.out.println("Invalid Column Selection");
	               
	         }
	         if (grid[last_row][inputColumnNumber] == '_')
	         { 
	        	
	        	 grid[last_row][inputColumnNumber] = 'Y';
	        	 
	        	 i++;
	             break; 
	             
	         }
	         else if(grid[last_row][inputColumnNumber]  == 'R' ||grid[last_row][inputColumnNumber]  == 'Y')
	         { 
	             if(grid[last_row-count][inputColumnNumber] == '_')
	             { 
	            	 grid[last_row - count][inputColumnNumber] = 'Y';
	            	 i++;
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