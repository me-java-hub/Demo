package sets;
import java.util.Comparator;

public class SortDesIntegerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);//descending order
    }
}
