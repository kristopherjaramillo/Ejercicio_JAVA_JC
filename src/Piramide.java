public class Piramide {

    public static void main(String[] args) {

        for (int piramid = 0; piramid < 5; piramid++) {
            for (int numAsterisco = 0; numAsterisco <= piramid; numAsterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

