import java.util.HashSet;
import java.util.Iterator;

public class HashingSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        if (set.contains(1))
            System.out.println("set contains");
        else
            System.out.println("set does not contain");
        // set.remove(1);
        if (!set.contains(1))
            System.out.println("deleted");
        else
            System.out.println("set does not contain");

        System.out.println(set.size());
        System.out.println(set);
        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }
}
