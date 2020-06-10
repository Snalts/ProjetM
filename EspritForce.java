public class EspritForce extends Esprit{
    
    public EspritForce(EffetPourcentage effet, String nom){
        this.effet = effet;
        this.nom = nom;
    }

    public Effet activeEffet(){
        return this.effet;
    }
    
}