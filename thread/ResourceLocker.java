import java.util.List;

public class ResourceLocker implements Runnable {
  private String name;
  private List<String> fromList;
  private List<String> toList;

  public ResourceLocker(String name, List<String> fromList, List<String> toList) {
    this.name = name;
    this.fromList = fromList;
    this.toList = toList;
  }

  public void run() {
    String str = null;
    try {
      

    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      System.out.printf("[%s] finished.%n", name);
    }
  }
}