package projet;
/*
public class Age 
{
		 public static void main(String args[]) 
		 {
			 int age;
			 age = Integer.parseInt(args[0]);
			 System.out.println("Vous avez " + age + " ans.");
		 }
}
*/
/*
public class Age 
{
    public static void main(String[] args) 
    {
        // Vérifiez que le nombre d'arguments est suffisant
        if (args.length < 3) {
            System.out.println("Usage : java Age <prénom> <nom> <âge>");
            return;
        }

        // Récupérez les arguments
        String prenom = args[0];
        String nom = args[1];
        int age;

        try {
            age = Integer.parseInt(args[2]); // Convertir l'âge en entier
        } catch (NumberFormatException e) {
            System.out.println("L'âge doit être un nombre valide !");
            return;
        }

        // Affichez les informations
        System.out.println("Prénom : " + prenom);
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }
}*/

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Créer un objet Scanner

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt(); // Lire un entier entré par l'utilisateur

        System.out.println("Vous avez " + age + " ans.");
        
        scanner.close(); // Fermer le scanner pour libérer les ressources
    }
}

