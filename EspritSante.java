public class EspritSante extends Esprit{
    
    public EspritSante(EffetPourcentage effet, String nom){
        this.effet = effet;
        this.nom = nom;
    }

    public Effet activeEffet(){
        return this.effet;
    }
    
}