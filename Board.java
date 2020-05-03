package Game;

public class Board 
{
		
	

    protected static final int rows = 6;
	protected static final int columns = 6;
    protected static char[][] grid = new char[rows][columns];
    protected static int last_row=rows-1;
    
	private static Board singletonInstance = null;
	public static Board createInstance() 
	{
		
		try
		{
			
			if(singletonInstance==null)
			{
				
				singletonInstance=new Board();
				return singletonInstance;
				
			}
			
			return singletonInstance;
		}
		catch(Exception e)
		{
			
		}
		return singletonInstance;
	
	    
	
	}
	public  void Creategrid()
    {
        
        for (int i = 0; i<rows; i = i+1) 
        {
            for (int j = 0; j<columns; j = j+1)
            {

                grid[i][j] = '_';
                
                
            }
        }
    }
    public  void printgrid() 
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