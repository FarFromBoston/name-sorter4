import Exceptions.InvalidPersonException;
import FileReader.ReadFile;
import FileReader.Sorter;
import FileWriter.WriteToFile;
import People.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Handles interaction between all packages
 * Obtain a text file named [unsorted-names-list]
 * Sorts the list into ascending order
 * Writes back to a new text file or creates a new one called
 * [sorted-names-list]
 */
public class Main {

    /**
     * Requires fileName [unsorted-names-list.txt] to exist
     * @param args
     */
    public static void main(String[] args) {
        try {
            List<Person> peopleList = ReadFile.readTextFile("unsorted-names-list.txt");
            List<Person> peopleListSorted = Sorter.sortPeopleFullName(peopleList);
            new WriteToFile(peopleListSorted);
        // catch all exceptions
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (InvalidPersonException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
