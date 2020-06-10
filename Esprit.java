public class Esprit{
    
    private EffetPourcentage effet;

    private String nom;

    public enum Statut{FORCE,SANTE,VITESSE,CHANCE};

    private Statut type;

    public Esprit(EffetPourcentage effet, String nom,Statut type){
        this.effet = effet;
        this.nom = nom;
        this.type = type;
    }

    public Effet activeEffet(){
        return this.effet;
    }
 
    public String getNom(){
        return this.nom;
    }

    public Statut getType(){
        return this.type;
    }

}