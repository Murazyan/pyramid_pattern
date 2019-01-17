package pyramidPattern3;

public class PyramidPattern3 {
    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }


    private static void printPattern4(int rows) {
        // for loop for the rows
        for (int i = 1; i <= rows; i++) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = (rows - i) * 2;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print numbers
            for (int x = 1; x <= i; x++) {
                System.out.print(x + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }

            //move to next line
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        printPattern4(9);
    }
}
