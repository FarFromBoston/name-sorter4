package FileWriter;

import People.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * This class handles all the necessary writing of persons
 * to a text file
 */
public class WriteToFile {


    /**
     * Writes a list of persons to a text file
     *
     * @param peopleList -
     *                     list of person objects
     */
    public WriteToFile(List<Person> peopleList){

        try {
            // write over existing file if exists or create new
            FileWriter myWriter = new FileWriter("sorted-names-list.txt", false);
            for (Person person: peopleList){
                // Get person name in order to append to text file
                String wholeName = person.getFirstName() + " " + person.getLastName();
                System.out.println(wholeName);
                myWriter.write(wholeName);
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


}
