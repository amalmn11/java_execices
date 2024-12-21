package projet;

public class Paire {

	public static void main(String[] args)
	{
		int value=Integer.parseInt(args[0]);
		if(value%2==0)
		{
			System.out.println(value+" est un nombre paire");
		}
		else
		{
			System.out.println(value+" est un nombre impaire");
		}
	}
}
