package FileReader;

import Exceptions.InvalidPersonException;
import People.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Class which reads in some text file of person names delimited by new lines
 * Then order the set of names first by last name, then by any given names the person may have. A
 * name must have at least 1 given name and may have up to 3 given names
 *
 */
public class ReadFile {

    /**
     * @param fileName (String) -
     *                 name of text file to read in person(s) names
     * @return peopleList (List<Person>) -
     *                  list of people with their last name and all
     *                  other given names
     * @throws IOException
     */
    public static List<Person> readTextFile(String fileName) throws IOException, InvalidPersonException {
        List<Person> peopleList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String data;
            while ((data = reader.readLine()) != null) {
                try {
                    List<String> names = getNames(data);
                }catch (InvalidPersonException e) {
                    System.out.println("invalid person");
                    throw e; // rethrowing the exception
                }
                List<String> names = getNames(data);
                if (names == null){
                    throw new IOException();
                }
                peopleList.add(makePerson(names));

            }
        // catch all exceptions
        } catch (FileNotFoundException | InvalidPersonException e) {
            System.out.println("An error occurred. File not found");
            throw e;
        }

        return peopleList;
    }

    /**
     * @param dataLine (String) -
     *                          line from text file
     * @return Names (List<String> ) -
     *                          names broken up into single
     *                          last name and multiple first names
     */
    public static List<String> getNames(String dataLine) throws InvalidPersonException {
        List<String> names = new ArrayList<>();
        String firstNames = "";
        String lastName = "";

        /* Divide into last name and given names */
        int finalspace = dataLine.lastIndexOf(" ");

        int i = 0;
        while(i < dataLine.length()){
            char c = dataLine.charAt(i);
            if (i < finalspace){
                firstNames += c;
            } else if (i == finalspace){
                ;
            } else {
                lastName += c;
            }
            i++;
        }
        names.add(firstNames);
        names.add(lastName);

        /* Check correct amount of given names */
        String namesList[] = dataLine.split(" ");
        if (names.get(0) == ""){
            throw new InvalidPersonException("Person entered is invalid");
        } else if (names.get(1) == "") {
            throw new InvalidPersonException("Person entered is invalid");
        } else if (namesList.length > 4) {
            throw new InvalidPersonException("Person entered is invalid");
        }
        return names;
    }

    /**
     * @param namesList (List<String>) -
     *                  First names and last name strings seperated into
     *                  two different items in a list
     * @return Person (Person obj) -
     *                  Person obj with a respective first and last name
     */
    public static Person makePerson(List<String> namesList) {
        Person newPerson = new Person(namesList.get(0), namesList.get(1));
        return newPerson;
    }


}







