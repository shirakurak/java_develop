package finalSample;

/**
 * final修飾子：変数を変更不可にするための修飾子
 * 誤ってインスタンスメソッド内で変更できないようにしたい場合に
 * 指定する。
 * 
 * staticとfinal修飾子の両方をつけたフィールド
 * ＝定数（クラス定数）
 * 例）ファイル名、固定のメッセージ
 * 
 */

public class finalTest {

    // クラスフィールドにfinal修飾子をつけてクラス定数を宣言
    static final String GREETING_MESSAGE = "Hello";

    // クラスフィールド
    static String staticField = "World";

    // クラスメソッド
    static String staticMethod() {
        return "yay!";
    }

    // インスタンスフィールド
    String instanceField = GREETING_MESSAGE;

    // インスタンスメソッド
    String instanceMethod() {
        return instanceField + " " + staticField 
            + " " + staticMethod();
    }
}