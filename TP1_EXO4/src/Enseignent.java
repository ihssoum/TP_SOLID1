public class Enseignent extends  Personne{

    private String Grade;

    public Enseignent(String nom, String prenom, String grade) {
        super(nom,prenom);
        Grade = grade;
    }


    public String getGrade() {
        return Grade;
    }


}
