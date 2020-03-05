package q7_2;

        import q7_1.Pair;

        import java.util.*;

public class Utils {
    public static <K extends Comparable<K>,V> List<Pair<K,V>> sortPairCollection (Collection<Pair<K,V>> col) {
        List<Pair<K,V>> result = new ArrayList<>();
        result.addAll(col);
        Comparator<Pair<K,V>> keyNameComparator = Comparator.comparing(Pair::k, Comparable::compareTo);
        Collections.sort(result, keyNameComparator);
        return result;
    }

    public static void main(String[] args) {
        Collection<Pair<String, Integer>> pairStack = new Stack<Pair<String, Integer>>() {
            {
                add(new Pair("Bella", 2));
                add(new Pair("Dude", 3));
            }
        };
        Collection<Pair<String, Integer>> pairsList = new LinkedList<Pair<String, Integer>>() {
            {
                add(new Pair("Ronaldo", 2));
                add(new Pair( "Messi", 3));
                add(new Pair( "Bella", 5));
                add(new Pair( "Dude", 1));
            }
        };
        Collection<Pair<Boolean, String>> booleanList = new LinkedList<Pair<Boolean, String>>() {
            {
                add(new Pair(true, "Bella"));
                add(new Pair(false, "Dude"));
            }
        };
        System.out.println(sortPairCollection(pairStack));
        System.out.println(sortPairCollection(pairsList));
        System.out.println(sortPairCollection(booleanList));
    }
}
