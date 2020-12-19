import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortInt  {
  private final List<Integer> list;

  public CollectionsSortInt(List<Integer> list) {
    this.list = list;
  }
  public List<Integer> sort(){
    Collections.sort(list, new Comparator<>() {
      @Override
      public int compare(Integer a, Integer b) {
        return a.compareTo(b);
      }
    });
    return list;
  }

  public List<Integer> lambdaSort() {
    Collections.sort(list, (Integer a, Integer b) ->
            a.compareTo(b));
    return list;
  }
}
