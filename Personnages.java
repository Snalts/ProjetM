public class Personnages {

	private Statistique force;

	private Statistique chance;

	private Statistique vitesse;

	private Statistique sante;

	void appliquerEffetForce(Effet e)
	{
		force.appliquerEffet(e);
	}

	void retirerEffetForce(Effet e)
	{
		force.retirerEffet(e);
	}

	void appliquerEffetChance(Effet e)
	{
		chance.appliquerEffet(e);
	}

	void retirerEffetChance(Effet e)
	{
		chance.retirerEffet(e);
	}

	void appliquerEffetVitesse(Effet e)
	{
		vitesse.appliquerEffet(e);
	}

	void retirerEffetVitesse(Effet e)
	{
		vitesse.retirerEffet(e);
	}

	void appliquerEffetSante(Effet e)
	{
		sante.appliquerEffet(e);
	}

}
