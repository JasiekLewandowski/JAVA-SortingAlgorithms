import java.util.List;

public class BubbleSort {
  
  public List<Integer> bubbleSort(List<Integer> list) {
    List<Integer> sortedList = list;
    int tempInt;
    while (!isSorted(sortedList)) {
      for (int i = 0; i < sortedList.size() - 1; i++) {
        if (sortedList.get(i) > sortedList.get(i + 1)) {
          tempInt = sortedList.get(i);
          sortedList.set(i, sortedList.get(i + 1));
          sortedList.set(i + 1, tempInt);
        }
      }
    }
    return sortedList;
  }

  public boolean isSorted(List<Integer> sortedList) {
    for (int i = 0; i < sortedList.size() - 1; i++) {
      if (sortedList.get(i) > sortedList.get(i + 1))
        return false;
    }
    return true;
  }
}
