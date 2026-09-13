package ma.projet;

/**
 * Programme de test pour la classe générique Triplet.
 */
public class TestTriplet {
    public static void main(String[] args) {
        // Triplet d'entiers
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();  // Affiche [1, 2, 3]

        // Triplet de chaînes
        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.affiche();  // Affiche [A, B, C]

        // Utilisation des getters
        System.out.println("Second élément de tInt : " + tInt.getSecond());
    }
}