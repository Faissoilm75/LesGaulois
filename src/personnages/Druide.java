package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudon = new chaudron();

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

}
