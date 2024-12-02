package helpers;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class GeneralHelper {
    static Scanner scanner = new Scanner(System.in);
    static String resourceFolder = "resources";

    public static String readInputUser() {
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void moveToLineAndClear(int lineNumber) {
        System.out.print("\033[" + lineNumber + ";1H");
        System.out.print("\033[J");
        System.out.flush();
    }

    public static void closeScanner() {
        scanner.close();
    }

    public static String readFile(String fileName) {
        String data = "";
        try {
            File file = new File(resourceFolder + "/" + fileName);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                data = data + "\n" + myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        
        return data.length() > 1 ? data.substring(1) : data;
    }

    public static void writeFile(String fileName, String data) {
        try (FileWriter fileWriter = new FileWriter(resourceFolder + "/" + fileName)) {
            fileWriter.write(data);
        } catch (Exception e) {
            // TODO: Handle error
        }
    }
    
}
