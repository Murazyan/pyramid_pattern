package pyramidPattern3;

public class PyramidPattern3 {
    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }


    private static void printPattern4(int rows) {
        for (int i = 1; i <= rows; i++) {
            int numberOfWhiteSpaces = (rows - i) * 2;

            printString(" ", numberOfWhiteSpaces);

            for (int x = 1; x <= i; x++) {
                System.out.print(x + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {
        printPattern4(9);
    }
}
