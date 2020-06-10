public class Personnages {

	private Statistique force;

	private Statistique chance;

	private Statistique vitesse;

	private Statistique sante;

	void appliquerEffetForce(Effet e)
	{
		force.setValeur(force.getValeur() + e.getValeur());
	}

	void appliquerEffetChance(Effet e)
	{
		chance.setValeur(chance.getValeur() + e.getValeur());
	}

	void appliquerEffetVitesse(Effet e)
	{
		vitesse.setValeur(vitesse.getValeur() + e.getValeur());
	}

	void appliquerEffetSante(Effet e)
	{
		sante.setValeur(sante.getValeur() + e.getValeur());
	}

}
