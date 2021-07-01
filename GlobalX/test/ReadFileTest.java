
import Exceptions.InvalidPersonException;
import FileReader.*;


import People.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static FileReader.ReadFile.getNames;
import static FileReader.ReadFile.readTextFile;
import static org.junit.Assert.*;


/**
 * tests text file reading is being handled correctly
 */
public class ReadFileTest {

    @Before
    public void setUp(){
        List<Person> peopleList = new ArrayList<>();
        Person p1 = new Person("Janet", "Parsons");
        Person p2 = new Person("Vaughn", "Lewis");
        peopleList.add(p1);
        peopleList.add(p2);
    }

    @Test
    // valid file
    public void readTextFileTest1() throws IOException, InvalidPersonException {
        readTextFile("unsorted-names-list.txt");
    }

    @Test (expected = FileNotFoundException.class)
    // invalid file
    public void readTextFileTest2() throws IOException, InvalidPersonException {
        readTextFile("hello.txt");
    }

    @Test
    /* test reading a first and last name */
    public void getNamesTest1() throws IOException, InvalidPersonException {
        List<String> names = new ArrayList<>();
        names.add("Janet");
        names.add("Parsons");
        Assert.assertEquals(getNames("Janet Parsons"), names);
    }

    @Test
    /* Test reading multiple first given names */
    public void getNamesTest2() throws IOException, InvalidPersonException {
        List<String> names = new ArrayList<>();
        names.add("Janet Michael Davis");
        names.add("Parsons");
        Assert.assertEquals(getNames("Janet Michael Davis Parsons"), names);
    }

    @Test (expected = InvalidPersonException.class)
    /* missing first or last name */
    public void getNamesTest3() throws IOException, InvalidPersonException {
        getNames("Parsons");
    }

    @Test (expected = InvalidPersonException.class)
    /* Too many given names */
    public void getNamesTest4() throws IOException, InvalidPersonException {
        getNames("Janet Michael Davis Harry Steven Willy Parsons");
    }


}
