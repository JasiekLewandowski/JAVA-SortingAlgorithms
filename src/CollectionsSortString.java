import java.util.Collections;
import java.util.List;

public class CollectionsSortString {
  private final List<String> list;

  public CollectionsSortString(List<String> list) {
    this.list = list;
  }
  public List<String> sort() {
    Collections.sort(list, (String a, String b) ->
            a.compareTo(b));
    return list;
  }
}
