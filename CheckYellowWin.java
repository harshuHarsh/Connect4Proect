package Game;

public class CheckYellowWin extends Board
{
	
	    public static boolean flag=true;
		public static boolean CheckYellowVertical()
	    {
	       
	        boolean flag = true;

	       
	        int counter = 0;
	        while(flag){

	            
	            for(int h = 0; columns > h; h += 1){
	                for(int w = 0; rows > w; w += 1){
	                    if(grid[w][h] == 'Y'){
	                        counter += 1;
	                    }else{
	                        counter = 0; 
	                    }
	                    if(counter >= 4){
	                    	 System.out.println("Player" + Dropcoin.c +" "+ "wins"); 
	                        flag = false;
	                    }
	                }
	            }
	            break;
	        }
	        return flag;
	    }

	    public static boolean CheckYellowHorizontal(){
	       
	        boolean flag = true;

	        
	        int counter = 0;
	        while(flag){

	            
	            for(int w = 0; rows > w; w += 1)
	            {
	                for(int h = 0; columns > h; h += 1)
	                {
	                    if(grid[w][h] == 'Y')
	                    {
	                        counter += 1;
	                    }
	                    else
	                    {
	                        counter = 0; 
	                    }
	                    if(counter >= 4)
	                    {
	                    	 System.out.println("Player" + Dropcoin.c +" "+ "wins");
	                        flag = false;
	                    }
	                }
	            }
	            break;
	        }
	        return flag;
	    }

	   
	    public static boolean CheckYellowDiagonalForward(){
	    
	        boolean flag = true;

	      
	        int counter = 0;

	       
	        Boolean check = false;

	       
	        int checkColumn = 1;
	        int checkRow = 1;

	        while(flag)
	        { 
	            for(int w = 0; rows > w; w += 1)
	            {
	                for(int h = 0; columns > h; h += 1){
	                    if(grid[w][h] == 'Y'){ 
	                        counter += 1;
	                        check = true;
	                        while(check){ 
	                            if(checkColumn + w <= rows - 1&& checkRow + h <= columns - 1){
	                                if(grid[w + checkColumn][h + checkRow] == 'Y'){ 
	                                    counter += 1;
	                                }
	                            }

	                          
	                            checkColumn += 1;
	                            checkRow += 1;

	                            if(checkColumn == rows -1 || checkRow == columns -1){ 
	                                check = false;
	                                break;
	                            }

	                            if(counter >= 4)
	                            {
	                            	 System.out.println("Player" + Dropcoin.c +" "+ "wins"); 
	                                check = false;
	                                flag = false;
	                                break;
	                            }
	                        }
	                    }
	                    if(counter >= 4){
	                        flag = false;
	                        break;
	                    }

	                    //resets counter and checkers
	                    counter = 0;
	                    checkColumn = 1;
	                    checkRow = 1;
	                }
	            }
	            break;
	        }
	        return flag;
	    }
	    public static boolean CheckYellowDiagonalReverse(){
	     
	        boolean flag = true;

	        int counter = 0;

	       
	        Boolean check = false;

	        int checkColumn = 1;
	        int checkRow = 1;

	        while(flag)
	        {
	            for(int w = 0; rows > w; w += 1){
	                for(int h = 0; columns > h; h += 1){
	                    if(grid[w][h] == 'Y')
	                    { 
	                        counter += 1;
	                        check = true;
	                        while(check)
	                        {
	                            if(w - checkColumn >= 0 && h - checkRow >= 0)
	                            {
	                                if(grid[w - checkColumn][h - checkRow] == 'Y')
	                                {
	                                    counter += 1; 
	                                }
	                            }

	                            
	                            checkColumn += 1;
	                            checkRow += 1;

	                            if(checkColumn == 0 || checkRow == columns -1)
	                            { 
	                                check = false;
	                                break;
	                            }

	                            if(counter >= 4)
	                            {
	                            	 System.out.println("Player" + Dropcoin.c +" "+ "wins"); 
	                                check = false;
	                                flag = false;
	                                break;
	                            }
	                        }
	                    }
	                    if(counter >= 4){
	                        flag = false;
	                        break;
	                    }

	                   
	                    counter = 0;
	                    checkColumn = 1;
	                    checkRow = 1;
	                }
	            }
	            break;
	        }
	        return flag;
	    }

	  
	    public static boolean CheckYellow()
	    {
	
	      
	        if(!CheckYellowVertical() || !CheckYellowHorizontal() || !CheckYellowDiagonalReverse() || !CheckYellowDiagonalForward()){
	            flag = false;
	        }
	        return flag;
	    }
	

}
