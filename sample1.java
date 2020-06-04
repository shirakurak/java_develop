public class sample1 {
    // ラッパークラス
    // プリミティブ型をに内包し、その値を操作する

    // int → プリミティブ型
    // Integer → そのラッパークラス

    // int → Integer
    Integer num01 = new Integer(10);        // 新たなオブジェクトを生成するので効率が悪い
    Integer num02 = Integer.valueOf(10);    // キャッシュされたオブジェクトを返す

    // Integer → int
    int num03 = num02.intValue();

    // String → Integer
    Integer num04 = new Integer("10");      // 新たなオブジェクトを生成するので効率が悪い
    Integer num05 = Integer.valueOf("10");  // キャッシュされたオブジェクトを返す
    Integer num06 = Integer.valueOf("11", 2);   // 基数(radix)を指定。この場合の値は3

    // String → int
    int num07 = Integer.parseInt("10");
    int num08 = Integer.parseInt("11", 2);  // 基数(radix)を指定。この場合の値は3

    // int → String
    String num09 = Integer.toString(10);

    // Integer → String
    String num10 = num01.toString();

    // クラスの変換はコンストラクタを使用しないのであれば
    // あとは調べて使えばよさそう
    // Java本格入門　No1279~
}