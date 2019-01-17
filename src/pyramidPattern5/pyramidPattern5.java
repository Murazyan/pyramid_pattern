package pyramidPattern5;

public class pyramidPattern5 {

    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }
    private static void printPattern5(int rows) {
        // for loop for the rows
        for (int i = rows; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = i*2;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print numbers
            for(int x=i; x<=rows; x++) {
                System.out.print(x+" ");
            }
            for(int j=rows-1; j>=i; j--) {
                System.out.print(j+" ");
            }

            //move to next line
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern5(8);
    }
}
