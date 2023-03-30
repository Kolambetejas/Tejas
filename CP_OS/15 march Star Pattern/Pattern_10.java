class Pattern_10
{
	public static void main (String args[])
	{
		int alpha=65;
		  for(int i=0; i<=5; i++)	  
	{ 
	for(int j=4; j>=i; j--)
	{
		System.out.print(" ");
	}
	
	for(int k=4-i+1; k<=4; k++)
	{
		System.out.print((char)(alpha+k)+" ");
	}
	
	System.out.println();
	
	}
		}
	}










/*
		A
	   B B
	 C  C  C
	D  D  D D
  E  E  E  E  E */
		