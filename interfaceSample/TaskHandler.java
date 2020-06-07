package Ch3.interfaceSample;

import javafx.concurrent.Task;

public interface TaskHandler {
    
    // 「public static final」は省略可
    public static final int TASK_TYPE_PRIVATE = 0;
    public static final int TASK_TYPE_WORK = 1;

    boolean handle(Task task);
}