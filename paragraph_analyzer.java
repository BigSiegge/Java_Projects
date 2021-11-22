import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MyMainClass {
    public static void main(String[] args) throws IOException {

        Scanner inputFile = new Scanner(new File("LinputFile.txt"));
        String text = "";
        int letterCounter = 0;
        int digitCounter = 0;
        int specialCounter = 0;

        while (inputFile.hasNextLine()) {
            text = text + inputFile.nextLine();
        }

        PrintWriter outputFile = new PrintWriter(new File("LoutputFile.txt"));

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                letterCounter++;
            } else if (Character.isDigit(text.charAt(i))) {
                digitCounter++;
            } else {
                specialCounter++;
            }
        }

        outputFile.println(text);
        outputFile.println("There are " + letterCounter + " letters.");
        outputFile.println("There are " + digitCounter + " numbers.");
        outputFile.println("There are " + specialCounter + " special characters." + "\n");

        countChars(text, 'a', 'z', outputFile);
        countChars(text, 'A', 'Z', outputFile);
        countChars(text, '0', '9', outputFile);
        countChars(text, '.', '.', outputFile);

        inputFile.close();
        outputFile.close();

    }

    public static void countChars(String text, char start, char end, PrintWriter outputFile) {

        for (char j = start; j <= end; j++) {
            int counter = 0;
            for (int i = 0; i < text.length(); i++)
                if (text.charAt(i) == j) {
                    counter++;
                }
            if (counter > 0) {
                outputFile.println(j + ": " + counter + " ");
            }
        }
    }
}
