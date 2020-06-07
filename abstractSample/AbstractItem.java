package Ch3.abstractSample;

// abstractメソッドを持つクラスには
// abstractの指定が必要
public abstract class AbstractItem {
    protected String name;

    public AbstractItem(String name) {
        this.name = name;
    }

    // 抽象メソッド
    // 子クラスで実装する
    public abstract void print(String parentPath);
}