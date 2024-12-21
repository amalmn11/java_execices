package projet;
import java.util.ArrayList;

abstract public class Forme 
{
	 private ArrayList<Forme> form;
	 protected double surface;
	 protected double perimetre;
	 abstract void afficher();
	 abstract void surface();
	 abstract void perimetre();
}

