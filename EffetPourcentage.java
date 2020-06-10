public class EffetPourcentage implements Effet{
    
    private int pourcent;

    public EffetPourcentage(int pourcent) {
        this.pourcent = pourcent;
    }

	@Override
	public int calculerStat(int valeur) {
		return valeur + valeur * pourcent / 100;
	}
}