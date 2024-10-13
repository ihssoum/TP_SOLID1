public class PrintTableauImp implements PrintTableau{
    SousFonctions sousFonctions= new SousFonctionsImp();
    @Override
    public void printTabbleau(MatriceYoung matriceYoung) {
        for(int i = 0; i < matriceYoung.getN(); i++){
            for(int j= 0; j< matriceYoung.getM(); j++){

                if(sousFonctions.getElement(i,j,matriceYoung)==MatriceYoung.INF){
                    System.out.print("INF" + ";");
                }
                else{
                    System.out.print(sousFonctions.getElement(i,j,matriceYoung) + ";");
                }
            }
            System.out.println();
        }
    }
}
