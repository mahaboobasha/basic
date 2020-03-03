package patternProgram;

public class ABCDPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x=3;
		int y=3;
		for(int i=1;i<=3;i++)
		{
			for (int j=1;j<=5;j++)
			{
			if((x==j)||(y==j))
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			}
			x--;
			y++;
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if((i==2)||(j==1||j==5))
				{
					System.out.print("* ");
			    }
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
		System.out.println();
		System.out.println();

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			
			if((i==1)||(i==3)||(i==5)||(j==1||j==5))
			{
				System.out.print("* ");
		    }
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
}
	System.out.println();
	System.out.println();

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			
			if((i==1)||(i==5)||(j==1))
			{
				System.out.print("* ");
		    }
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
}
	System.out.println();
	System.out.println();

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			
			if((i==1)||(i==5)||(j==2)||(j==5))
			{
				System.out.print("* ");
		    }
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
}
	System.out.println();
	System.out.println();
}
}
