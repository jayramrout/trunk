package jrout.tutorial.corejava.lamdaExpression.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by jrout on 10/5/2015.
 */
public class DuplicateCode {
    final static List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal",
                    "Raju", "Sara", "Scott");
    final static List<String> editors = Arrays.asList("Brian", "Jackie",
            "John", "Mike");
    final static List<String> comrades =
            Arrays.asList("Kate", "Ken", "Nick",
                    "Paula", "Zach");

    public static void main(String[] args) {
    }

    public void duplicateCode(){
        // To find out names starts with N
        final long countFriendsStartN =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
        final long countEditorsStartN =
                editors.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
        final long countComradesStartN =
                comrades.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
    }

    public void removeDuplicates() {

        final Predicate<String> startsWithN =
                name -> name.startsWith("N");

        final long countFriendsStartN =
                friends.stream()
                        .filter(startsWithN)
                        .count();
        final long countEditorsStartN =
                editors.stream()
                        .filter(startsWithN)
                        .count();
        final long countComradesStartN =
                comrades.stream()
                        .filter(startsWithN)
                        .count();

    }



}
