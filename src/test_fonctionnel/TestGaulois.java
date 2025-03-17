package test_fonctionnel;

import personnages.Druide;
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

		System.out.println("Dans la foret " + asterix.getNom() + "et" + obelix.getNom() + "tombe nez sur le romain"
				+ minus.getNom() + ".");

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		Romain brutus = new Romain("brutus", 14);
		Druide panoramix = new Druide("panoramix", 2);
		panoramix.frabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}

}
