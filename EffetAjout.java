public class EffetAjout implements Effet{

    private int bonus;

    public EffetAjout(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculerStat(int valeur) {
        return valeur + bonus;
    }

    
}