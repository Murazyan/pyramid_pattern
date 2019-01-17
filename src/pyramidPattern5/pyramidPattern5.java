package pyramidPattern5;

public class pyramidPattern5 {

    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }
    private static void printPattern5(int rows) {
        for (int i = rows; i >= 1; i--) {
            int numberOfWhiteSpaces = i*2;

            printString(" ", numberOfWhiteSpaces);

            for(int x=i; x<=rows; x++) {
                System.out.print(x+" ");
            }
            for(int j=rows-1; j>=i; j--) {
                System.out.print(j+" ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern5(8);
    }
}
