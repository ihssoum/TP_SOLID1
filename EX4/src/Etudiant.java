public class Etudiant extends Personne{

    private Integer numero;


    public Etudiant(String nom, String prenom,Integer numero) {
     super(nom,prenom);
        this.numero = numero;
    }



    public Integer getNumero() {
        return numero;
    }
}
