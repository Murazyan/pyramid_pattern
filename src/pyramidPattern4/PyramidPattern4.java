package pyramidPattern4;

public class PyramidPattern4 {

    private static void printPattern4(int rows) {
        for (int i = 1; i <= rows; i++) {
            int numberOfWhiteSpaces = rows - i;
            printString(" ", numberOfWhiteSpaces);
            printRow(i);
            System.out.println();
        }
    }

    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }

    public static void printRow(int row){
        for (int i = 1; i <= row; i++) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        printPattern4(9);
    }
}
