package heritage;

public class Web extends RefBiblioraphie 
{
	private String LienWeb;
	Web(String Titre, String LienWeb)
	{
		super(Titre.substring(0, 1).toUpperCase() + Titre.substring(1).toLowerCase()," ");
		this.LienWeb=LienWeb;
	}
	
	public void Affichage() 
	{
			System.out.println("Titre :"+this.Titre);
			System.out.println("lien de site web:"+this.LienWeb);
	}
}
