public class PiramideInvertida {

    public static void main(String[] args) {
        for (int piramid = 6 ; piramid > 0; piramid--) {
            for (int numAsterisco = 0; numAsterisco < piramid; numAsterisco++)
            {
                System.out.print("*");
            }
            System.out.println();
        }//for
    }//main
}
