class Pattern_7{

	public static void main(String args[])
	{	//Upper Triangle
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{ 
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
System.out.println();}}}
	/*class Pattern_8{

	public static void main(String args[])
	{	//Upper Triangle
		
	for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)	
			{	
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{				
				System.out.print(" *");	
			}
			
			System.out.println();	
			
	}
	}
	
}*/