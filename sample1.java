public class sample1 {
    // ラッパークラス
    // プリミティブ型をに内包し、その値を操作する

    // int → プリミティブ型
    // Integer → そのラッパークラス

    // int → Integer
    Integer num01 = new Integer(10);        // 新たなオブジェクトを生成するので効率が悪い
    Integer num02 = Integer.valueOf(10);    // キャッシュされたオブジェクトを返す
}