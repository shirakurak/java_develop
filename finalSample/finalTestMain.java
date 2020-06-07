package finalSample;

public class finalTestMain {
    public static void main(String... args) {
        System.out.println(finalTest.GREETING_MESSAGE);
        System.out.println(finalTest.staticField);
        System.out.println(finalTest.staticMethod());

        // コンパイルエラー
        // finalTest.GREETING_MESSAGE = "Hello!";

        finalTest.staticField = "Japan";

        finalTest test = new finalTest();
        System.out.println(test.instanceMethod());
    }
}