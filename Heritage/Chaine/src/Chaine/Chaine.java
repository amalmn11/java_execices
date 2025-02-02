package Chaine;
import java.util.Scanner;

public class Chaine 
{	
	public static int nombre_mot(String s)
	{
		if(s==null || s.isEmpty())  return 0;
		
		int nbrmot=0;
		boolean dansUnMot=false;
		for(int i=0 ; i<s.length() ; i++)
		{
			char c=s.charAt(i);
			
			if(c==' ') dansUnMot=false;
			else if(!dansUnMot)
			{
				nbrmot++;
				dansUnMot=true;
			}
		}
		return nbrmot;
	}
	
	
	public static int nombre_voyelles(String s)
	{
		int nbrvoyelle=0;
		
		for(int i=0 ; i<s.length() ; i++)
		{
			char c=s.charAt(i);
			
			if(c=='a' || c=='o' || c=='y' || c=='e' || c=='i' || c=='u') nbrvoyelle++;
		}
		return nbrvoyelle;
	}
	
	public static int nombre_virgule(String s)
	{
		int nbrvirgule=0;
		
		for(int i=0 ; i<s.length() ; i++)
		{
			char c=s.charAt(i);
			
			if(c==',') nbrvirgule++;
		}
		return nbrvirgule;
	}
	
	public static int nombre_point(String s)
	{
		int nbrpoint=0;
		
		for(int i=0 ; i<s.length() ; i++)
		{
			char c=s.charAt(i);
			
			if(c=='.') nbrpoint++;
		}
		return nbrpoint;
	}
	
	
	public static void main(String[] args)
	{
		System.out.print("Entrer une phrase :");
		Scanner scanner = new Scanner(System.in);
		String phrase=scanner.nextLine(); 
		
		int nbrmot=nombre_mot(phrase);
		System.out.print("le nombre de mot du phrase c'est :" + nbrmot + "\n");
		
		
		int nbrvoyelle=nombre_voyelles(phrase);
		System.out.print("le nombre de voyelles du phrase c'est :" + nbrvoyelle + "\n");
		
		int nbrpoint=nombre_point(phrase);
		System.out.print("le nombre de point du phrase c'est :" + nbrpoint + "\n");
		
		int nbrvirgule=nombre_virgule(phrase);
		System.out.print("le nombre de virgule du phrase c'est :" + nbrvirgule + "\n");
		
	}
	
	
}
