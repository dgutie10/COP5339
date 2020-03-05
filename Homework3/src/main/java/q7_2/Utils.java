package q7_2;

        import q7_1.Pair;

        import java.util.*;

public class Utils {
    public static <K extends Comparable<K>,V> List<Pair<K,V>> sortPairCollection (Collection<Pair<K,V>> col) {
        List<Pair<K,V>> result = new ArrayList<>();
        result.addAll(col);
        Comparator<Pair<K,V>> keyNameComparator
                = Comparator.comparing(
                Pair::k, Comparable::compareTo);
        Collections.sort(result, keyNameComparator);
        return result;
    }

    public static void main(String[] args) {
        Collection<Pair<Integer, String>> pairStack = new Stack<Pair<Integer, String>>() {
            {
                add(new Pair(2, "Bella"));
                add(new Pair(1, "Dude"));
            }
        };
        Collection<Pair<Integer, String>> pairsList = new LinkedList<Pair<Integer, String>>() {
            {
                add(new Pair(2, "Ronaldo"));
                add(new Pair(1, "Messi"));
                add(new Pair(4, "Bella"));
                add(new Pair(3, "Dude"));
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
