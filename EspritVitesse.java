public class EspritVitesse extends Esprit {
    
    public EspritVitesse(Effet effet, String nom){
        this.effet = effet;
        this.nom = nom;
    }

    public Effet activeEffet(){
        return this.effet;
    }
}