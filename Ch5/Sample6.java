package Ch5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Sample6 {
  public static void main(String[] args) {

    // Map → Set → Stream
    Map<String, String> map = new HashMap<>();
    map.put("1", "ken");
    map.put("2", "1");
    map.put("3", "shira");

    Stream<String> stream = map.values().stream();
    stream.forEach(System.out::println);
  
  }
}