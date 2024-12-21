package heritage;
import java.time.LocalDate;


public class Article extends RefBiblioraphie {

	LocalDate datePublishier;
	
	Article(String titre, String auteur, LocalDate date)
	{
		super(titre.toLowerCase(),auteur.toLowerCase());
		this.datePublishier=date;
	}
	
	public void Affichage() 
	{
			System.out.println("Titre :"+this.Titre);
			System.out.println("Auteur :"+this.Auteur);
			System.out.println("Date de publication :"+this.datePublishier);
	}
	
}
