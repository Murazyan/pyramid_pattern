package pyramidPattern1;


public class PyramidOne {
    private static void printPattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            int numberOfWhiteSpaces = rows - i;
            printString(" ", numberOfWhiteSpaces);
            printString(i + " ", i);
            System.out.println();
        }
    }

    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }
    public static void main(String[] args) {
        printPattern1(9);
    }





}
