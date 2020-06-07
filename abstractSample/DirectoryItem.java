package Ch3.abstractSample;

import java.io.File;
import java.util.List;

public class DirectoryItem extends AbstractItem {
    private List<AbstractItem> children;

    public DirectoryItem(String name, List<AbstractItem> children) {
        super(name);
        this.children = children;
    }

    // 親クラスのabstractメソッドをオーバライドする
    @Override
    public void print(String parentPath) {
        for(AbstractItem child : children) {
            child.print(parentPath + File.separator + name);
        }
    }
}