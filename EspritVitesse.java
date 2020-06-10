public class EspritVitesse extends Esprit {
    
    public EspritVitesse(EffetPourcentage effet, String nom){
        this.effet = effet;
        this.nom = nom;
    }

    public Effet activeEffet(){
        return this.effet;
    }
}