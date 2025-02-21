package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		System.out.println();
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obleix", 16);
		Romain minus = new Romain("Minus", 6);

		asterix.parler("Bonjour");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
