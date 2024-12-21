package projet;


public class Carre extends Forme
{
	private int cote;
	
	
	Carre(int a)
	{
		this.cote=a;
	}
	
	void surface()
	{
		this.surface=Math.pow(this.cote, 2);
	}
	
	void perimetre()
	{
		this.perimetre=4*this.cote;
	}
	
	void afficher()
	{
		System.out.println("la longeur d'un cote  : "+this.cote);
		System.out.println("surface : "+this.surface);
		System.out.println("perimetre : "+this.perimetre);
	}
}

