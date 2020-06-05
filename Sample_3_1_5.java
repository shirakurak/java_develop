public class Sample_3_1_5 {

    // 3-1-5 オートボクシングとアンボクシング
    // 以下の自動変換のこと：
    // オートボクシング：プリミティブ型　→　ラッパークラス
    // アンボクシング： ラッパークラス　→　プリミティブ型

    int num = 10;

    // オートボクシング
    // コンパイル時にInteger.valueOf(10)に自動変換される
    Integer numInt = 10;

    // アンボクシング
    // numIntがnumInt.intValue()でintに自動変換
    // オートボクシング
    // 演算結果
    Integer sum = num + numInt;


    /** 
     * 注意
     * 事前に生成されているオブジェクトの範囲外の値に対して
     * オートボクシングすると異なるオブジェクトになる。
    */
    void test() {
        // 動作確認済み
        // true
        Integer int1 = 127;
        Integer int2 = 127;
        System.out.println(int1 == int2);

        // false
        Integer int3 = 128;
        Integer int4 = 128;
        System.out.println(int3 == int4);
    }    
}

// App.javaに貼り付けて動作確認済み
class Sample1 {

    /** 自動変換のメリット
     *  →　わざわざ変換処理を書かなくてよい
     * デメリット
     *  →　意図しない変換が発生 → 非効率な処理　
     */

     Integer num1 = new Integer(3);
     Integer num2 = new Integer(3);

    //  System.out.println(num1 == num2);
    //  System.out.println(num1.equals(num2));

}

/**
 * オートボクシング/アンボクシング使用の方針
 * １．原則として明示的な変換を行う。
 * （オートボクシング、アンボクシングは利用しない）
 * ２．ファイル/DB/HTTPリクエストを保持する値は
 * ラッパークラスを用いる。
 * ３．数値計算には、プリミティブ型
 * ４．記述量の削減が効果的な場合に限り、
 * オートボクシング/アンボクシングを利用する。
 * 
 * オートボクシング/アンボクシングについて理解するのは
 * 必要だが、ちゃんと理解したうえで、できるだけ
 * 使わないようにする。
 * 適当に変換しない。適当にどっちかを用いらない。
 */
