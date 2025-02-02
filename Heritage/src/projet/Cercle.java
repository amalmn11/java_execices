package projet;

public class Cercle extends Forme
{
	private double  rayon;
	final static double PI=3.14;
	
	Cercle(double r)
	{
		this.rayon=r;
	}
	
	void surface()
	{
		this.surface=PI*Math.pow(this.rayon,2);
	}
	
	void perimetre()
	{
		this.perimetre=2*this.rayon*PI;
	}
	
	void afficher()
	{
		System.out.println("surface : "+this.surface);
		System.out.println("perimetre : "+this.perimetre);
	}
}
