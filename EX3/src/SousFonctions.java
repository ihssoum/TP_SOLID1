public interface SousFonctions {
    void maintainYoungProperty(MatriceYoung matriceYoung);
    boolean isFull(MatriceYoung matriceYoung);
    void insertElement(int key,MatriceYoung matriceYoung);
    int getElement(int i,int j,MatriceYoung matriceYoung);
    void setElement(int i, int j , int valeur,MatriceYoung matriceYoung);
    void equilibrerTableau(int i , int j,MatriceYoung matriceYoung);
}
