package projet;


public class Base
{
	public static void main(String[] args) 
	{
        // Création d'un carré avec un côté de 4
        Carre carre = new Carre(4);
        carre.surface();
        carre.perimetre();
        System.out.println("=== Informations sur le carré ===");
        carre.afficher();

        // Création d'un triangle avec base = 6, hauteur = 4, côté1 = 5, côté2 = 7
        Triangle triangle = new Triangle(6, 4, 5, 7);
        triangle.surface();
        triangle.perimetre();
        System.out.println("\n=== Informations sur le triangle ===");
        triangle.afficher();

        // Création d'un cercle avec un rayon de 3
        Cercle cercle = new Cercle(3);
        cercle.surface();
        cercle.perimetre();
        System.out.println("\n=== Informations sur le cercle ===");
        cercle.afficher();
    }
}
