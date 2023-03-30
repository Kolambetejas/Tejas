class Pattern_8
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)      		// Row
		{
			for(int j=4; j>=i; j--)				//Spaces
			{
				System.out.print(" ");
			}	
			for(int k=5-i+1; k<=5; k++)// if the condition is reverse so.....
			{
				System.out.print(k+" ");
			}System.out.println();
				
		}
	}
}

	/*	5		row spaces	     	for (int i=1;i<=5;i++)    row	
	   4 5		5		4	for (j=4;j<=1; j--)
	  3 4 5		4		3
	 2 3 4 5
    1 2 3 4 5*/