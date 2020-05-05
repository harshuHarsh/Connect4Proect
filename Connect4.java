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
    public void anotherGame(char c2)
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
	    		System.out.println("Total games won" + " " +wincount1);
	    		System.exit(0);
    		}
    		else
    		{
    			System.out.println("Total games won" + " " +wincount);
        		System.exit(0);
    			
    		}
    		
    		
    	}
    	
    }
    
    public Connect4()
    {
    	Dropcoin.i=1;
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
	        	
	        	if(Dropcoin.i%2==1)
	        	{
		        	 Dropcoin.dropYellow();
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
	        	if(Dropcoin.i%2==0)
		        {
	        		 Dropcoin.dropRed();		        		
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
	        	
	        	if(Dropcoin.i%2==1)
	        	{
		        	 Dropcoin.dropRed(); 
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
	        	if(Dropcoin.i%2==0)
		        {
	        		
	        		 Dropcoin.dropYellow();
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
        	anotherGame(c);
        }
    	
    }
        
}
        
    
   
   
	
	
