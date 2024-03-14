import java.io.*;
import java.util.Scanner;

public class HiraganaDictionary {

    private HiraganaChar[] dictionary = new HiraganaChar[46]; // Hiragana size of 46
    public static int size = 0; // this might not be needed 
    
    public HiraganaDictionary() { // default constructor
        // tries to open the csv and read it
        try (Scanner sc = new Scanner(new File("Japanese-app/src/app/backend/JPNSCHARACTERS.csv"))) {
            sc.useDelimiter(","); // idrk but it works
            sc.nextLine(); // skips title line
            do {
                String line = sc.nextLine();
                String[] values = line.split(",");
                // creates and adds the character object to dictionary
                HiraganaChar newChar = new HiraganaChar(values[0], values[1]);
                addToDictionary(newChar);
            } while (sc.hasNextLine());
            sc.close();
        } catch (Exception e) {
            // catches if could not open the file for some reason
            System.out.println("Could not find file");
        }
    }
    // method that gets self called to add to dictionary
    private void addToDictionary(HiraganaChar character) {
        try {
            dictionary[size] = character;
            size++;
        } catch (Exception e) {
            System.out.println("Out of array range");
        }
    }

    // method to return the whole dictionary object
    public HiraganaChar[] getDictionary() {
        return dictionary;
    }
    // method to get a specific character in the dictionary at the index location
    public HiraganaChar getChar(int index) {
        try {
            return dictionary[index];
        } catch (Exception e) {
            System.out.println("Index out of range");
            return null;
        }
    }
}

