package staticSample;

/**
 * 非staticなフィールドやメソッドはインスタンスに関連づく。
 * インスタンスメソッド　→　クラスフィールド（アクセス可能）
 * クラスメソッド　→　インスタンスフィールド（コンパイルエラー）
 * ∵）クラスメソッドから見ると、どのフィールドにアクセスすれば
 * いいか不明なため。
 */

public class StaticTestMain {
    public static void main(String... args) {

        // クラスフィールド、クラスメソッド
        System.out.println(StaticTest.staticField);
        System.out.println(StaticTest.staticMethod());

        StaticTest.staticField = "Japan";
        System.out.println(StaticTest.staticField);

        StaticTest test = new StaticTest();
        System.out.println(test.staticField);
        System.out.println(test.staticMethod());
        System.out.println(test.instanceMethod());

        test.staticField = "Murata";
        System.out.println(test.instanceMethod());

        StaticTest test2 = new StaticTest();

        test2.staticField = "Okada";
        System.out.println(StaticTest.staticField);
        System.out.println(test.staticField);
        System.out.println(test2.staticField);
        System.out.println(test2.instanceMethod());

        test2.instanceField = "Yo";
        System.out.println(test2.instanceMethod());
        System.out.println(test.instanceMethod());
    }
}