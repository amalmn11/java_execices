package projet;


public class Triangle extends Forme

{
	private double base;
	private double hauteur;
	private double cote1;
	private double cote2;
	
	Triangle(double a, double b,double c,double d)
	{
		this.base=a;
		this.hauteur=b;
		this.cote1=c;
		this.cote2=d;
	}
	
	void surface()
	{
		this.surface=this.base*this.hauteur;
	}
	
	void perimetre()
	{
		this.perimetre=this.base+this.cote1+this.cote2;
	}
	
	void afficher()
	{
		System.out.println("la base du triagle : "+this.base);
		System.out.println("la hauteur de triagle : "+this.hauteur);
		System.out.println("la longeru des deux cotes  : "+this.cote1+"  "+this.cote2);
		System.out.println("surface : "+this.surface);
		System.out.println("perimetre : "+this.perimetre);
	}
}
