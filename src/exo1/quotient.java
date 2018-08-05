package exo1;

import java.util.Scanner;

import javax.xml.ws.Response;

public class quotient {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
	String reponse = "n";
	
	do {
		System.out.println("Entrez A:");
		int a = sc.nextInt();
		
		System.out.println("Entrez B:");
		int b = sc.nextInt();
		
		// essayer
		try {
			StringBuilder sb = new StringBuilder( "résultat :");  //Stringbuilder évite les duplications mémoires
			sb.append(a/b);
			System.out.println(sb.toString());
//			int c = (a/b);
//			System.out.println("résultat : " + c);
		}
		
		// affichge si erreur  - on commence par le catch le plus spécifique
		catch (ArithmeticException e){
			System.out.println("Impossible d'effectuer l'opération !");
		}
		
//		catch (Exception exception) {
//			System.out.println(exception.getMessage());
//		}
		
		
		System.out.println("Voulez vous réessayer ? o/n");
		reponse = sc.nextLine();
		
		} while (reponse.equals("o"));
		

		
	}

}
