public class Pattern {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= 2; j++) {

                if (i == 1 || j == 1 || j == 2) {
                    System.out.print("* ");
                }

            }

            System.out.println();
        }
    }
}
