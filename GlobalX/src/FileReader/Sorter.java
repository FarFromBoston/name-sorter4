package FileReader;

import People.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorts list of person objects by last name
 */
public class Sorter  {

    /**
     * Sorts people based on their lastName attribute in ascending
     * order
     *
     * @param peopleList (List<Person>) -
     *                   list of people to sort
     * @return peopleList (List<Person>) -
     *                  list of people sorted
     */
    public static List<Person> sortPeopleList(List<Person> peopleList){
        peopleList.sort((o1, o2)
                -> o1.getLastName().compareTo(
                o2.getLastName()));

        return peopleList;
    }

    /**
     * Sorts people based on their given names attribute in ascending
     * order after having sorted by surname. This is in case
     * there are multiple people with the same surname.
     *
     * @param peopleList (List<Person>) -
     *                   list of people sorted by surname
     * @return peopleList (List<Person>) -
     *                  list of people sorted
     */
    public static List<Person> sortPeopleFullName(List<Person> peopleList) {
        int counter = 1;

        Collections.sort(peopleList, new Comparator() {

            public int compare(Object o1, Object o2) {

                String x1 = ((Person) o1).getLastName();
                String x2 = ((Person) o2).getLastName();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                String x3 = ((Person) o1).getFirstName();
                String x4 = ((Person) o2).getFirstName();
                return x3.compareTo(x4);
            }});

        return peopleList;
    }



}
