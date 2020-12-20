import java.util.List;

public class SelectionSort {
  private final List<Integer> list;

  public SelectionSort(List<Integer> list) {
    this.list = list;
  }

  public List<Integer> selectionSort(){
    for (int i = 0;i<list.size()-1;i++){
      int maxInt = list.get(i);
      int indexToSwap = i;
      for(int j = i + 1;j < list.size() - 1;j++){
        int checkedInt = list.get(j);
        if (checkedInt > maxInt) {
          maxInt = checkedInt;
          indexToSwap = j;
        }
      }
      list.set(indexToSwap, list.get(i));
      list.set(i, maxInt);
    }
    return list;
  }
}
