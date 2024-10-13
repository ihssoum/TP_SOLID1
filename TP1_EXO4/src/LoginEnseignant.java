public class LoginEnseignant implements Login{

    @Override
    public String generateLogin(Personne personne) {
        Enseignent enseignent=(Enseignent) personne;
     return enseignent.getPrenom()+enseignent.getNom() + enseignent.getGrade()+"usms.ma";

    }
}
