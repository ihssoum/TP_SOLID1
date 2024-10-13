import java.util.ArrayList;

public class SousFonctionsImp implements SousFonctions{

    @Override
    public void maintainYoungProperty(MatriceYoung matriceYoung) {
        int i = matriceYoung.getN() - 1;
        int j = matriceYoung.getM()- 1;
        int key = getElement(matriceYoung.getN()- 1, matriceYoung.getM() - 1,matriceYoung); // Récupérer l'élément ajouté

        while (i > 0 || j > 0) {
            int top = (i > 0) ? this.getElement(i - 1, j,matriceYoung) : MatriceYoung.INF;
            int left = (j > 0) ? this.getElement(i, j - 1,matriceYoung) : MatriceYoung.INF;

            if (key < top && key < left) {
                break;  // Key is in the right place
            } else if (top < left) {
                this.setElement(i, j, top,matriceYoung);
                i--;
            } else {
                this.setElement(i, j, left,matriceYoung);
                j--;
            }
        }
        this.setElement(i, j, key,matriceYoung); // Positionner la clé à sa place
    }

    public boolean isFull(MatriceYoung matriceYoung) {
        return getElement(matriceYoung.getN() - 1, matriceYoung.getM() - 1,matriceYoung) != MatriceYoung.INF;
    }
   public void insertElement(int key,MatriceYoung matriceYoung) {
        this.setElement(matriceYoung.getN() - 1, matriceYoung.getM() - 1, key,matriceYoung);
    }
    public int getElement(int i,int j,MatriceYoung matriceYoung){
        return ((ArrayList<Integer>) matriceYoung.get(i)).get(j);
    }
    public void setElement(int i, int j , int valeur,MatriceYoung matriceYoung){
        ((ArrayList<Integer>) matriceYoung.get(i)).set(j,valeur);
    }
    public void equilibrerTableau(int i , int j,MatriceYoung matriceYoung){
        int down = (i + 1 < matriceYoung.getN()) ? this.getElement(i + 1,j,matriceYoung) : MatriceYoung.INF;
        int right = (j + 1 < matriceYoung.getM()) ? this.getElement(i,j + 1,matriceYoung) : MatriceYoung.INF;

        if (down == MatriceYoung.INF && right == MatriceYoung.INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            this.setElement(i,j,down,matriceYoung);
            equilibrerTableau(i + 1, j,matriceYoung);
        } else {
            this.setElement(i,j,right,matriceYoung);
            equilibrerTableau(i, j + 1,matriceYoung);
        }
    }
}
