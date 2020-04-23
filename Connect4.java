package Connect4;

import java.util.Scanner;

public class Connect4
{
   
    private boolean win=true; 
    public static void main(String[] args)
    {
    	System.out.println("Select one from 1 - 6 to drop your coin"+"\n");
    	
    	Board.Creategrid();
    	Board.printgrid();
        System.out.println("Please Choose one color between Red and yellow-Type in R or Y: ");
        char c =Coin.returnCoin();
        while(true)
        {
	        Board.printgrid();
	        Dropcoin.dropRed();
	        Dropcoin.dropYellow();
	        Board.printgrid();
        }
        
        
    }
   
   
	
	
}