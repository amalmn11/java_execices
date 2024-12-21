package projet;

public class DiviseurCommun {

	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int PGCD;
		if(b==0)
		{
			PGCD=a;
		}
		else
		{
			while(b!=0)
			{
				int reste=a%b;
				a=b;
				b=reste;
			}
			PGCD=a;
		}
		System.out.println("PGCD entre "+args[0]+" et "+args[1]+" est :" + PGCD);
		
	}
}
