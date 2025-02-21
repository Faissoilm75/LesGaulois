package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	
	public static void main(String[] args) {
		System.out.println();
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obleix",16);
		asterix.parler("Bonjour");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		
	}

}
