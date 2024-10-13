public class LoginEtudiant implements Login{
    @Override
    public String generateLogin(Personne personne) {
        Etudiant etudiant=(Etudiant) personne;
        return etudiant.getPrenom().charAt(0)+etudiant.getNom() + "usms.ac.ma";

    }
}
