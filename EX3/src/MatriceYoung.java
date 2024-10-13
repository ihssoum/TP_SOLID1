
import java.util.ArrayList;
import static java.lang.Integer.MAX_VALUE;
 /*Exemple :
        1  2  3
        2  4  5
        6  7  8

  */
public class MatriceYoung  extends ArrayList<Object>{
    AddElement addElement= new AddElementImp();
    ExtraireMin extraireMin=new ExtraireMinImp();
    SousFonctions sousFonctions=new SousFonctionsImp();
    PrintTableau printTableau=new PrintTableauImp();
   public static final int INF = Integer.MAX_VALUE;
    private int n;
    private int m;
    public MatriceYoung(int n , int m ) {
        super(n);
        this.n=n;
        this.m = m;
        for (int i = 0; i < n; n++){
            this.add(new ArrayList<Integer>(m));
            for (int j = 0; j < m; j++){
                sousFonctions.setElement(i,j,INF,this);
            }
        }
    }

     public int getN() {
         return n;
     }

     public void setN(int n) {
         this.n = n;
     }
     public int getM() {
         return m;
     }

     public void setM(int m) {
         this.m = m;
     }

     public int extraireMin(){
        return extraireMin.extraireMin(this);
    }
    @Override

        public boolean add(Object o) {
        return addElement.add(o,this);
    }
     public void printTabbleau(){
         printTableau.printTabbleau(this);
     }

     // Fonction pour rétablir la propriété du tableau de Young après l'extraction du minimum


   }
