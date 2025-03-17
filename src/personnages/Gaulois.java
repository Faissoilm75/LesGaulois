package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "le gaulois " + nom + ":";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " + nomRomain);
		romain.recevoirCoup((force * effetPotion) / 3);
		if (effetPotion > 1) {
			effetPotion--;
		}

	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println("Astérix");

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", getNom()=" + getNom() + "]";
	}

}
