package Ch3.interfaceSample;

import javafx.concurrent.Task;

public class AnonymousClassSample {
    public static void main(String... args) {
        // TaskHandlerインタフェースを実装する匿名クラスを定義し、
        // インスタンス化する
        TaskHandler taskHandler = new TaskHandler() {
            public boolean handle(Task task) {
                // taskに関する処理
            }
        };

        Task myTask = new Task();
        taskHandler.handle(myTask);
    }
}