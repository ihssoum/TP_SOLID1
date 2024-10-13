public class CompteUniversitaire {
    private Personne personne;
    private String login;

    public CompteUniversitaire(Personne personne,Login loginInterface) {
        this.personne = personne;
        this.login=loginInterface.generateLogin(personne);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
