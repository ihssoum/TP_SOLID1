public class Main {
    public static void main(String[] args) {
       //Enseinant
        Personne personneEnseignant=new Enseignent("imane","ElHallam","grade");
        Login loginGeneratorEns=new LoginEnseignant();
        CompteUniversitaire compteUniversitaireEns=new CompteUniversitaire(personneEnseignant,loginGeneratorEns);
        System.out.println(compteUniversitaireEns.getLogin());
       //Etudiant
        Personne personneEtudiant=new Etudiant("ihssane","Soumir",10);
        Login loginGeneratorEt=new LoginEtudiant();
        CompteUniversitaire compteUniversitaireEt=new CompteUniversitaire(personneEtudiant,loginGeneratorEt);
        System.out.println(compteUniversitaireEt.getLogin());


    }
}