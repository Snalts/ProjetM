public class EspritChance extends Esprit{
    
    public EspritChance(Effet effet, String nom){
        this.effet = effet;
        this.nom = nom;
    }

    public Effet activeEffet(){
        return this.effet;
    }
    
}