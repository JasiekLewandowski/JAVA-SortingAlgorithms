import java.util.List;

public class InsertionSort {
  List<Integer> sortedList;
  int i, j, tempInt;

  public List<Integer> insertSort(List<Integer> list) {
    sortedList = list;
    for (i = 1; i < sortedList.size();i++){
      tempInt = sortedList.get(i);
      j=i;
      while (j > 0 && sortedList.get(j-1) > tempInt){
        sortedList.set(j, sortedList.get(j-1));
        j--;
      }
      sortedList.set(j, tempInt);
    }
    return sortedList;
  }
  public List<Integer> invertInsertSort(List<Integer> list) {
    sortedList = list;
    for (i = 1; i < sortedList.size(); i++) {
      tempInt = list.get(i);
      j = i;
      while (j > 0 && sortedList.get(j - 1) < tempInt){
        sortedList.set(j, sortedList.get(j-1));
        j--;
      }
      sortedList.set(j, tempInt);
    }
    return sortedList;
  }
}
