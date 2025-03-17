package personnages;

import Objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "" + texte + "");

	}

	private String prendreParole() {
		return "Le druide" + nom + " : ";

	}

	public void frabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J' ai concocté " + quantite + "doses de potion magique." + " Elle a une force de " + forcePotion + ".");

	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if ("Obélix".equals(gaulois.getNom())) {

				parler("Non" + gaulois.getNom() + "Non !... et tu le sais très bien !   ");

			} else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens " + gaulois.getNom() + "un peu de potion magique.");
			}

		} else {
			parler("Désolé " + gaulois.getNom() + ("il n'y a plus une seule goutte de potion."));
		}

	}

}
