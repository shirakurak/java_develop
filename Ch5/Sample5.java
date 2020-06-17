package Ch5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Sample5 {
  public static void main(String[] args) {

    // List/Set → Stream
    List<String> list =
      Arrays.asList("Murata", "Okada", "Tanimoto");

    // streamメソッド：List/SetからStreamを作成する
    Stream<String> stream = list.stream();
    // 各要素の出力
    stream.forEach(System.out::println);

    // 配列 → Stream
    String[] array = {"ken", "1", "shirakura"};
    Stream<String> stream2 = Arrays.stream(array);
    stream2.forEach(System.out::println);

    // 配列を作成せず、Streamインスタンスを作成する
    Stream<String> stream3 = Stream.of("shi", "ra");
    stream3.forEach(System.out::println);

    // Map → Set → Stream
    Map<String, String> map = new HashMap<>();
    map.put("1", "ken");
    map.put("2", "1");
    map.put("3", "shira");

    Stream<Entry<String, String>> stream4 = map.entrySet().stream();
    stream4.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
  
  }
}