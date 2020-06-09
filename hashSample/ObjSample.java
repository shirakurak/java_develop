package Ch3.hashSample;

public class ObjSample {

    @Override
    public boolean equals(Object obj) {
        // このオブジェクトと引数で渡された
        // objの内容が等しければtrueを返し、
        // 異なればfalseを返す。
        return false;
    }

    /**
     * equalsメソッドを実装した場合、
     * もう１つ実装しなくてはならないメソッド：
     * hashCode
     * - 自身のオブジェクトの内容を表す数値
     * （ハッシュ値）を返すメソッド
     * 
     * ハッシュ値：オブジェクトの値を
     * 一定のルールに従って数値化したもの
     * 同じ値を持つオブジェクトは
     * 同じハッシュ値となる。
     * しかし、同じハッシュ値だからといって
     * 同じ値を持つオブジェクトであるとは
     * 限らない。
     */

     @Override
     public int hashCode() {
         // このオブジェクトの内容を表す
         // 数値を返す。
         return 0;
     }

     /**
      * 高速にオブジェクトの等価判定を行うため
      * 最初にハッシュ値でオブジェクトを比較
      * ハッシュ値が等しい場合に限り、
      * equalsメソッドで厳密判定をする
      */

}