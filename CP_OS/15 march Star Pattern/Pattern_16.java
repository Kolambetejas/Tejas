class Pattern_16
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--)      		// Row
		{
			for(int k=5; k>=i; k--) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
				
		}
	}
}