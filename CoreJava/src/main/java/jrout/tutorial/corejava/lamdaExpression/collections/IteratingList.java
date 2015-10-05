package jrout.tutorial.corejava.lamdaExpression.collections;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by jrout on 10/5/2015.
 */
public class IteratingList {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal",
                        "Raju", "Sara", "Scott");

        /*for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        for(String name : friends) {
            System.out.println(name);
        }*/
      /*  friends.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });*/
        /*friends.forEach((final String name) ->
                System.out.println(name));
        */

        /*friends.forEach((name) ->
                System.out.println(name));
        */

        /*
            Below code : if u have single parameter
         */
        /*friends.forEach(name ->
                System.out.println(name));
        */

        // using method references
        friends.forEach(System.out::println);
    }
}
