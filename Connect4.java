package Game;
public class Connect4
{
   
    
    public static void main(String[] args)
    {
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
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
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
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
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
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
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
			                 break; 
			             }
			 	        if(!CheckYellowWin.CheckYellow())
			 	        {
			 	        	CheckYellowWin.flag = false; 
			                 break; 
			             }
		 	        
			        	
		        }
	        	
	        	
	        }
	       
        }
    }
}
        
    
   
   
	
	
