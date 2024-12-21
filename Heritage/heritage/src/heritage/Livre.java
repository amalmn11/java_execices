package heritage;

public class Livre extends RefBiblioraphie  
{
	private int AnneePublication;
	Livre(String titre,String auteur,int an)
	{
		super(titre.toUpperCase(),auteur.toUpperCase());
		AnneePublication=an;
	}
	public void Affichage() 
	{
		System.out.println("Titre :"+this.Titre);
		System.out.println("Auteur :"+this.Auteur);
		System.out.println("Annee de publication :"+this.AnneePublication);
	}
}
