public class EspritSante extends Esprit{
    
    public EspritSante(Effet effet, String nom){
        this.effet = effet;
        this.nom = nom;
    }

    public Effet activeEffet(){
        return this.effet;
    }
    
}