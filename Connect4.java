package Game;

import java.util.Scanner;

public class Connect4
{
   
	public static int wincount=0;
	public static int wincount1=0;
    public static void main(String[] args)
    {

    	
    	new Connect4();
    	
    	
    	
    }
   
    
    public Connect4()
    {
    	Dropyellow.i=1;
    	System.out.println("Select one from 1 - 6 to drop your coin"+"\n");
    	Board b=Board.createInstance();
    	b.Creategrid();
    	b.printgrid();
        System.out.println("Please Choose one color between Red and yellow-Type in R or Y: ");
        char c = Coin.returnCoin();
       
        while(CheckYellowWin.flag==true && CheckRedWin.flag==true)
        {
        	
	        if(c=='Y')
	        {
	        	
	        	if(Dropyellow.i%2==1)
	        	{
		        	 Dropyellow.dropYellow();
		        	 b.printgrid();
		        	 if(!CheckRedWin.CheckRed())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount1++;
			                 
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount++;
			                 
			                 break; 
			             }
		 	        
	            }
	        	if(Dropyellow.i%2==0)
		        {
	        		 DropRed.dropRed();		        		
		        	 b.printgrid();
		        	 if(!CheckRedWin.CheckRed())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount++;
			                 
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount++;
			                 break; 
			             }
		 	        
			        	
		        }
	        	
	 	        
	        	
	        }
	      
	        if(c=='R')
	        {
	        	
	        	if(Dropyellow.i%2==1)
	        	{
		        	 DropRed.dropRed(); 
		        	 b.printgrid();
		        	 if(!CheckRedWin.CheckRed())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount1++;
			                 
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount++;
			                
			                 break; 
			             }
		 	        
	        	
	        	}
	        	if(Dropyellow.i%2==0)
		        {
	        		
	        		 Dropyellow.dropYellow();
		        	 b.printgrid();
		        	 if(!CheckRedWin.CheckRed())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount1++;
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			 	        	wincount++;
			                 
			                 break; 
			             }
			 	        
		        }
	        	
	        	
	        }
	       
        }
        if(c=='R')
        {
        	NextGame.anotherGame(c);
        }
    	
    }
        
}
        
    
   
   
	
	
