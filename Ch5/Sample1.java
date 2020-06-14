package Ch5;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 8 → Javaの文法を大きく変えるような新機能が導入 
 * - ラムダ式 
 * - Stream API
 * （大量データを逐次処理する「ストリーム処理」の効率的記述のため）
 * 
 * Stream API = 作成/中間操作/終端操作の3つの操作
 * - 作成：最初に１つ。コレクションや配列などからStreamを作成する
 * - 中間操作：StreamからStreamを作成する
 * - 終端操作：最後に１つ。Streamからコレクションや配列を生成したり、要素ごとに処理をしたり、要素を集計したりする。 
 */

public class Sample1 {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student("Ken", 100));
    students.add(new Student("Shin", 60));
    students.add(new Student("Takuya", 80));

    students.stream()                                     // 「作成」。Streamインスタンスを生成する
      .filter(s -> s.getScore() >= 70)                      //「中間操作」。scoreが70以上のStudentの抽出
      .forEach(s -> System.out.println(s.getName()));     // 「終端操作」。名前を表示する。

  }
}