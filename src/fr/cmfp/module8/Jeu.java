package fr.cmfp.module8;

import java.util.Random;

public class Jeu {
	
	private int scoreJoueur;
	private int scoreOrdi;

	/**
	 * @author Stagiaire FISCHER
	 * @param choix1 représente le choix utilisateur
	 * @param choix2 représente le choix ordinateur
	 * @param le score affécté
	 */
	public void comparerChoix(Choix user, Choix ia) {
		if (user == ia) {

		}
		if (user == user.CISEAUX && ia == ia.FEUILLE) {
			this.scoreJoueur++;
		}
		if (user == user.FEUILLE && ia == ia.CISEAUX) {
			this.scoreOrdi++;
		}
		if (user == user.CISEAUX && ia == ia.PIERRE) {
			this.scoreOrdi++;
		}
		if (user == user.PIERRE && ia == ia.CISEAUX) {
			this.scoreJoueur++;
		}
		if (user == user.FEUILLE && ia == ia.PIERRE) {
			this.scoreJoueur++;
		}
		if (user == user.PIERRE && ia == ia.FEUILLE) {
			this.scoreOrdi++;
		}
		System.out.println("Le score du joueur est " + this.scoreJoueur + ", le score de l'IA est " + this.scoreOrdi);
	}

	/**
	 * Condition associant les chiffres random parcouruent aux 3 choix du jeu
	 * @return Le choix aléatoire de l'ordinateur
	 */
	public Choix ordinateur() {
		Random random = new Random();
		Choix ia = null;
		int choixAi;
		choixAi = random.nextInt(3);

		if (choixAi == 0) {
			ia = Choix.CISEAUX;
		} else if (choixAi == 1) {
			ia = Choix.FEUILLE;
		} else if (choixAi == 2) {
			ia = Choix.PIERRE;
		}
		return ia;
	}

	/**
	 * Méthode permettant d'afficher le score
	 */
	public void score() {
		System.out.println("Score ordinateur = " + this.scoreOrdi + " Score utilisateur = " + this.scoreJoueur);
	}

	public int getScoreJoueur() {
		return scoreJoueur;
	}

	public int getScoreOrdi() {
		return scoreOrdi;
	}

}
