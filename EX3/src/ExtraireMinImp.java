public class ExtraireMinImp implements ExtraireMin{
    SousFonctions sousFonctions=new SousFonctionsImp();
    @Override
    public int extraireMin(MatriceYoung matriceYoung) {
        /*Aucun élément n'est inséré dans le tableau*/
        if(sousFonctions.getElement(0,0,matriceYoung) == MatriceYoung.INF ){
            return MatriceYoung.INF;
        }
        else{
            int min = sousFonctions.getElement(0,0,matriceYoung);
            sousFonctions.equilibrerTableau(0,0,matriceYoung);
            return min;
        }

    }

}
