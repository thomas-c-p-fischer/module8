package fr.cmfp.module8;

import java.util.Random;

public class Jeu {
	private int scoreJoueur;
	private int scoreOrdi;

	/**
	 * @author Stagiaire FISCHER
	 * @param choix1 représente le choix utilisateur
	 * @param choix2 représente le choix ordinateur
	 * @return le score affécté
	 */
	public void comparerChoix(Choix user, Choix ia) {
		if (user == ia) {

		}
		if (user == Choix.CISEAUX && ia == Choix.FEUILLE) {
			this.scoreJoueur++;
		}
		if (user == Choix.FEUILLE && ia == Choix.CISEAUX) {
			this.scoreOrdi++;
		}
		if (user == Choix.CISEAUX && ia == Choix.PIERRE) {
			this.scoreOrdi++;
		}
		if (user == Choix.PIERRE && ia == Choix.CISEAUX) {
			this.scoreJoueur++;
		}
		if (user == Choix.FEUILLE && ia == Choix.PIERRE) {
			this.scoreJoueur++;
		}
		if (user == Choix.PIERRE && ia == Choix.FEUILLE) {
			this.scoreOrdi++;
		}
		System.out.println("Le score du joueur est " + this.scoreJoueur + ", le score de l'IA est " + this.scoreOrdi);
	}

	public void ordinateur(int choixOrdi) {
		Random random = new Random();
		Choix ia;
		choixOrdi = random.nextInt(3);
		if (choixOrdi == 0) {
			ia = Choix.CISEAUX;
		} else if (choixOrdi == 1) {
			ia = Choix.FEUILLE;
		} else if (choixOrdi == 2) {
			ia = Choix.PIERRE;
		}
		System.out.println(choixOrdi);
	}

	public int getScoreJoueur() {
		return scoreJoueur;
	}

	public void setScoreJoueur(int scoreJoueur) {
		this.scoreJoueur = scoreJoueur;
	}

	public int getScoreOrdi() {
		return scoreOrdi;
	}

	public void setScoreOrdi(int scoreOrdi) {
		this.scoreOrdi = scoreOrdi;
	}
	
	
}
