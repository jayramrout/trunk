package jrout.tutorial.corejava.collections.sortObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class  SortingObjects {
    private static final List list = getPersons();

    public static void main(String[] args) {
        //		sortCollection();
        sortUsingLambdaExpression();
    }

    public static void sortCollection() {
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new ProfSort()); // lambda expression
        System.out.println(list);
    }

    /**
     *
     */
    public static void sortUsingAnonymousInnerClass() {
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.profession.compareTo(o2.profession);
            }
        });

    }

    public static void sortUsingLambdaExpression() {
        Collections.sort(list, (Object o1, Object o2) -> ((Person)o1).profession.compareTo(((Person)o2).profession));
        Collections.sort(list, (o1, o2) -> ((Person) o1).profession.compareTo(((Person) o2).profession));
        System.out.println(list);
    }

    public static List getPersons() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("A", "Andaman", "Army"));
        list.add(new Person("C", "Camaron", "Worker"));
        list.add(new Person("B", "Mass", "Cook"));
        list.add(new Person("D", "Bombay", "Army"));
        return list;
    }
}