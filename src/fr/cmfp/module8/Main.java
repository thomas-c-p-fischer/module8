package fr.cmfp.module8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Choix ia = Choix.PIERRE;
		Choix joueur = Choix.FEUILLE;
		int choixUser = 0;
		int choixOrdi = 0;
		Jeu ordi = new Jeu();
		Jeu score = new Jeu();

		for (int i = 0; i < 3; i++) {
			System.out.println("Choississez entre CISEAUX (0), FEUILLE (1), PIERRE (2).");
			choixUser = scanner.nextInt();
			System.out.println("Le choix de l'IA.");
			ordi.ordinateur(choixOrdi);
			
			if (choixUser == 0) {
				joueur = Choix.CISEAUX;
			} else if (choixUser == 1) {
				joueur = Choix.FEUILLE;
			} else if (choixUser == 2) {
				joueur = Choix.PIERRE;
			}
			
			
			
			score.comparerChoix(joueur, ia);
		}
		
		scanner.close();
	}
}
