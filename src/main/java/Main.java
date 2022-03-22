import java.util.stream.IntStream;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Creare Intersectii:
        Intersection[] nodes = IntStream.rangeClosed(0, 8) // Maxim 8 intersectii.
                .mapToObj(i -> new Intersection("i" + i)) // Format nume: "i"i.
                .toArray(Intersection[]::new);


        Set<Intersection> intersections = new HashSet<>();
        intersections.addAll(Arrays.asList(nodes));

        // Creare lista si seturi:
        List<Streets> strazi = new LinkedList<>();
        strazi.add(new Streets("alpha", 3, nodes[0], nodes[1]));
        strazi.add(new Streets("beta", 4, nodes[1], nodes[2]));
        strazi.add(new Streets("gamma", 1, nodes[0], nodes[2]));
        strazi.add(new Streets("omega", 2, nodes[2], nodes[3]));

        // Sortare (in functie de lungime):
        strazi.sort(new Comparator<Streets>() {
            @Override
            public int compare(Streets a, Streets b) {
                if (a.getLength() > b.getLength())
                    return 1;
                if (a.getLength() < b.getLength())
                    return -1;
                return 0;
            }
        });

        System.out.println(strazi);
    }
}
