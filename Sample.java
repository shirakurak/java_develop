public class Sample {

    private int primitive;

    private Integer wrapper;

    @Override
    public String toString() {
        return "primitive:" + primitive +
        ", wrapper:" + wrapper;
    }

    /** 
     * ラッパー型 → 0とデータがない状態を区別したい場合に用いる
     * 通信やファイルなどから読み込む値はラッパー型にすべき。
    */

    
}