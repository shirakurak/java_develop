import java.util.ArrayList;
import java.util.List;

public class DeadLockSample {

  public static void main(String... args) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    list1.add("list-1");
    list2.add("list-2");

    new Thread(new ResourceLocker("スレッドA", list1, list2)).start();
    new Thread(new ResourceLocker("スレッドB", list2, list1)).start();
  }
}