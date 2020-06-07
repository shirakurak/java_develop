package staticSample;

public class StaticTest {

    // クラスフィールド
    static String staticField = "World";

    // クラスメソッド
    static String staticMethod() {
        return "yay!";
    }

    // インスタンスフィールド
    String instanceField = "Hello";

    // インスタンスメソッド
    String instanceMethod() {
        return instanceField + " " + staticField
            + staticMethod();
    }
}