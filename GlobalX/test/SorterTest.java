import FileReader.*;


import People.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static FileReader.ReadFile.readTextFile;
import static FileReader.Sorter.*;
import static org.junit.Assert.*;

/**
 * Tests list of person objects correctly sorted
 * on last name
 */
public class SorterTest {

    private static List<Person> unSortedPplList = new ArrayList<>();
    private static List<Person> sortedPplList = new ArrayList<>();

    @Before
    public void setUp(){
        Person p1 = new Person("Janet", "Parsons");
        Person p2 = new Person("Vaughn", "Lewis");
        Person p3 = new Person("Jbnet", "Parsons");
        Person p4 = new Person("Alex", "Parsons");
        unSortedPplList.add(p1);
        unSortedPplList.add(p2);
        unSortedPplList.add(p3);
        unSortedPplList.add(p4);
        sortedPplList.add(p2);
        sortedPplList.add(p4);
        sortedPplList.add(p1);
        sortedPplList.add(p3);
    }

    @Test
    // SurNames sorted correctly
    public void sortPeopleListSurnameTest1() {
        List<Person> unSortedPplList1 = new ArrayList<>();
        List<Person> sortedPplList1 = new ArrayList<>();
        Person p1 = new Person("Janet", "Parsons");
        Person p2 = new Person("Vaughn", "Lewis");
        unSortedPplList1.add(p1);
        unSortedPplList1.add(p2);
        sortedPplList1.add(p2);
        sortedPplList1.add(p1);
        Assert.assertEquals(sortPeopleList(unSortedPplList1), sortedPplList1);
    }

    @Test
    // FirstNames sorted correctly test1
    public void sortPeopleListGivenNameTest1() {
        List<Person> sortedList = sortPeopleList(unSortedPplList);
        Assert.assertEquals(sortPeopleFullName(unSortedPplList), sortedList);
    }


}
