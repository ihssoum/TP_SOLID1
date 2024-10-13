import java.util.ArrayList;

public class AddElementImp implements AddElement{
    SousFonctions sousFonctions=new SousFonctionsImp();
    @Override
    public boolean add(Object o,MatriceYoung matriceYoung) {
        int key = (Integer) o;

        if (sousFonctions.isFull(matriceYoung)) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        sousFonctions.insertElement(key,matriceYoung);
        sousFonctions.maintainYoungProperty(matriceYoung);

        return true;

    }






}
