package division;


class Rationnel
{
	private int nominateur;
	private int denominateur;
	
	Rationnel(){
		
	}
	Rationnel(int a,int b)
	{
		if(b==0) 
		{
			System.out.println("Error:le denominateur est egale à 0");
			System.exit(0);
		}
		else
		{
			this.nominateur=a;
			this.denominateur=b;
		}
	}
	
	public int getNominateur(){return this.nominateur;}
	public int getDenominateur(){return this.denominateur;}
	
	public void setNominateur(int a){this.nominateur=a;}
	public void setDenominateur(int b)
	{
		if(b==0)
		{
			System.out.println("Error:le denominateur est egale à 0");
			System.exit(0);
		}
		else {
			this.denominateur=b;
		}
	}
	public double CalculeRationnel()
	{ 
		return this.nominateur/this.denominateur;
	}
	
	
	public Rationnel Somme(Rationnel r)
	{
		Rationnel a=new Rationnel();
		
		if(this.denominateur==r.denominateur)  
		{
			a.nominateur=this.nominateur+r.nominateur;
		}
		else 
		{
			a.nominateur=(this.nominateur*r.denominateur)+(this.denominateur*r.nominateur);
			a.denominateur=this.denominateur*r.denominateur;
		}
		return a;
	}
	
	public Rationnel Produit(Rationnel r)
	{
		Rationnel a=new Rationnel();
		a.nominateur=this.nominateur*r.nominateur;
		a.denominateur=this.denominateur*r.denominateur;
		return a;
	}
	
	
	public void afficher()
	{
		System.out.println("le nombre rationnel est : "+this.nominateur+"/"+this.denominateur);
	}
}

public class division 
{
	public static void main(String[] args)
	{
		Rationnel r=new Rationnel(12,2);
		
		r.afficher();
		
		//r.setDenominateur(0);
		
		
		Rationnel p=new Rationnel(10,5);
		
		Rationnel somme = new Rationnel();
		
		
		System.out.println("Resultat de somme :");
		somme=r.Somme(p);
		somme.afficher();
		
		
		System.out.println("Resultat de produit :");
		Rationnel produit = new Rationnel();
		produit=r.Produit(p);
		
		produit.afficher();
		
		
	}
}
