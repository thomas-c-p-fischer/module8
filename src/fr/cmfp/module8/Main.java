package fr.cmfp.module8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Variables
		 */
		Scanner scanner = new Scanner(System.in);
		Choix joueur = null;
		int choixUser = 0;
		Jeu jeu = new Jeu();
		
		/**
		 * Boucle qui va permettre de jouer tant que l'un des 2 n'atteint pas 3 manches gagnantes
		 */
		do {
			System.out.println("Choississez entre CISEAUX (0), FEUILLE (1), PIERRE (2).");
			choixUser = scanner.nextInt();
			if (choixUser == 0) {
				joueur = Choix.CISEAUX;
			} else if (choixUser == 1) {
				joueur = Choix.FEUILLE;
			} else if (choixUser == 2) {
				joueur = Choix.PIERRE;
			}

			Choix ia = jeu.ordinateur();
			jeu.comparerChoix(joueur, ia);
			System.out.println("Choix utilisateur : " + joueur);
			System.out.println("Choix IA : " + ia);
			jeu.score();

		} while (jeu.getScoreOrdi() != 3 && jeu.getScoreJoueur() != 3);

		if (jeu.getScoreOrdi() == 3) {
			System.out.println("l'ordi a gagné !!!");
		} else
			System.out.println("J'ai gagné !!");
		scanner.close();
	}
}
