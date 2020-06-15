package Ch5;

import java.util.Arrays;
import java.util.List;

/**
 * メソッド参照：
 * 用意されているメソッドそのものを代入する
 */
public class Sample4 {
  public static void main(String[] args) {

    List<String> list = Arrays.asList("Xxx", "Yyyy", "Zzzz");
    
    // forEach：Listインタフェースのメソッド
    // Listの要素に対して、引数に渡した処理を順次実行する 
    list.forEach(System.out::println);
  }
}

/**
 * https://docs.oracle.com/javase/jp/8/docs/api/java/util/ArrayList.html
 * forEach(Concumer<? super E> action)
 * 
 */

/**
 * メソッド参照の文法
 * ・インスタンスのメソッドを参照
 * {インスタンス名}::{メソッド名}
 * ・自分自身のインスタンスのメソッドを参照
 * this::{メソッド名}
 * ・staticメソッドを参照
 * {クラス名}::{メソッド名}
 */