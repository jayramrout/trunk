package jrout.tutorial.corejava.lamdaExpression.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jrout on 10/5/2015.
 */
public class FindingElements {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal",
                        "Raju", "Sara", "Scott");

        //
        /*final List<String> startsWithN =
                new ArrayList<String>();
        for(String name : friends) {
            if(name.startsWith("N")) {
                startsWithN.add(name);
            }
        }*/

        //
        final List<String> startsWithN2 = friends.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(String.format("Found %d names", startsWithN2.size()));
    }
}
