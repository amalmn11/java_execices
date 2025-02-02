package heritage;

import java.time.LocalDate;

public class Main 
{
	
    public static void main(String[] args) 
    {
        // Création et affichage d'un objet Livre
        Livre livre = new Livre("Les Misérables", "Victor Hugo", 1862);
        System.out.println("=== Livre ===");
        livre.Affichage();

        // Création et affichage d'un objet Article
        Article article = new Article("intelligence artificielle", "John Smith", LocalDate.of(2024, 12, 19));
        System.out.println("\n=== Article ===");
        article.Affichage();

        // Création et affichage d'un objet Web
        Web web = new Web("google", "https://www.google.com");
        System.out.println("\n=== Web ===");
        web.Affichage();
    }
    
}
