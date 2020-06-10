public class Statistique {

	private int valeur;

	public Statistique(int val)
	{
		this.valeur = val;
	}

	public void appliquerEffet(Effet e) {
		this.valeur e.calculerStat(this.valeur);
	}

	public void retirerEffet(Effet e)
	{
		this.valeur -= e.calculerStat(this.valeur);
	}
}
