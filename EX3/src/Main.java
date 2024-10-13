public class Main {
    public static void main(String[] args) {
        // Création d'une matrice de Young de taille 3x3
        MatriceYoung matriceYoung = new MatriceYoung(3, 3);

        System.out.println("Tableau initial:");
        matriceYoung.printTabbleau();

        // Ajout d'éléments
        System.out.println("\nAjout des éléments : 10, 5, 3, 12, 15, 7");
        matriceYoung.add(10);
        matriceYoung.add(5);
        matriceYoung.add(3);
        matriceYoung.add(12);
        matriceYoung.add(15);
        matriceYoung.add(7);

        // Afficher le tableau après ajout
        System.out.println("Tableau après ajout des éléments :");
        matriceYoung.printTabbleau();

        // Extraction de l'élément minimum plusieurs fois
        System.out.println("\nExtraction des éléments minimums :");
        int minElement = matriceYoung.extraireMin();
        while (minElement != MatriceYoung.INF) {
            System.out.println("Élément minimum extrait : " + minElement);
            matriceYoung.printTabbleau();
            minElement = matriceYoung.extraireMin();
        }
    }
}
