package jrout.tutorial.corejava.lamdaExpression.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jrout on 10/5/2015.
 */
public class TransformingList {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal",
                        "Raju", "Sara", "Scott");

        final  List<String> upperCaseNames = new ArrayList<>();

        // Approach 1
/*        for(String name : friends) {
            upperCaseNames.add(name.toUpperCase());
        }
*/

        // Approach 2
/*
        friends.forEach(name -> upperCaseNames.add(name.toUpperCase()));
        System.out.println(upperCaseNames);
*/
        // map is used for transforming
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name +" "));
        System.out.println(friends);

        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));

        // using method references
        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));


        friends.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);

    }
}
