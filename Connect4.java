package Game;
public class Connect4
{
   
    
    public static void main(String[] args)
    {
    	System.out.println("Select one from 1 - 6 to drop your coin"+"\n");
    	Board.Creategrid();
    	Board.printgrid();
        System.out.println("Please Choose one color between Red and yellow-Type in R or Y: ");
        char c = Coin.returnCoin();
        
        while(CheckWin.flag==true)
        {
        	
	        if(c=='Y')
	        {
	        	
	        	if(Dropcoin.i%2==1)
	        	{
		        	 Dropcoin.dropYellow();
		        	 Board.printgrid();
		        	 if(!CheckWin.CheckX())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
			 	        if(!CheckWin.CheckO())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
		 	        
	            }
	        	if(Dropcoin.i%2==0)
		        {
	        		 Dropcoin.dropRed();		        		
		        	 Board.printgrid();
		        	 if(!CheckWin.CheckX())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
			 	        if(!CheckWin.CheckO())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
		 	        
			        	
		        }
	        	
	 	        
	        	
	        }
	      
	        if(c=='R')
	        {
	        	
	        	if(Dropcoin.i%2==1)
	        	{
		        	 Dropcoin.dropRed(); 
		        	 Board.printgrid();
		        	 if(!CheckWin.CheckX())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
			 	        if(!CheckWin.CheckO())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
		 	        
	        	
	        	}
	        	if(Dropcoin.i%2==0)
		        {
	        		
	        		 Dropcoin.dropYellow();
		        	 Board.printgrid();
		        	 if(!CheckWin.CheckX())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
			 	        if(!CheckWin.CheckO())
			 	        {
			 	        	CheckWin.flag = false; 
			                 break; 
			             }
		 	        
			        	
		        }
	        	
	        	
	        }
	       
        }
    }
}
        
    
   
   
	
	
