package Ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample3 {
  public static void main(String[] args) {

    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Murata", 100));
    studentList.add(new Student("Okada", 70));
    studentList.add(new Student("Tanimoto", 80));

    System.out.println(studentList);
    
    // ラムダ式を使ったソート
    Collections.sort(studentList, (student1, student2) -> 
      Integer.compare(student1.getScore(), student2.getScore()));
    
    System.out.println(studentList);
  }
} 

/**
 * インタフェースの実装をいろいろな宣言を踏まえて書く代わりに
 * 処理の内容を表す式だけ書けばよい。
 * 
 * 関数型インタフェース：
 * 実装すべきメソッドが１つしかないインタフェース
 * 
 * ラムダ式の基本文法
 * (引数) -> { 処理 }
 * 
 * 引数部分：普通のメソッド定義の引数部分と同様に書く：
 * compare(Student o1, Student o2)
 * 対応するラムダ式を書くと、
 * (Student student1, Student s2) -> {
 *    return Integer.compare(
 *      student1.getScore(), student2.getScore());
 * }
 * 
 * メソッドの引数の型を省略できる：
 * (student1, student2) -> {
 *    return Integer.compare(
 *      student1.getScore(), student2. getScore());
 * }
 * 
 * ラムダ式の処理が1つしかない場合、returnと処理の{}を
 * 省略できる：
 * (student1, student2) -> 
 *    Integer.compare(student1.getScore(), student2.getScore())
 * 
 * 他の例）
 * Consumer<String> consumer1 =
 *  (String s) -> {System.out.println(s);}
 * 
 * 丸括弧の省略可：
 * Consumer<String> consumer1 = 
 *  s -> {System.out.println(s);}
 * 
 * 引数が0個の場合：
 * Runnable runnable1 = 
 *  () -> {System.out.println("ラムダ式のテストです。")}
 * 
 * {}内に複数行書けるケース：
 * (student1, student2) -> {
 *    int score1 = student1.getScore();
 *    int score2 = student2.getScore();
 *    return Integer.compare(score1, score2);
 * }
 * 
 */
