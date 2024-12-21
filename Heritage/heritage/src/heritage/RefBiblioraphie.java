package heritage;

abstract class RefBiblioraphie 
{
	protected String Titre;
	protected String Auteur;
	RefBiblioraphie(String titre , String author){
		this.Auteur=author;
		this.Titre=titre;
	};
	public abstract void Affichage();

}
