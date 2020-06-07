package Ch3.superSub;

public class SubClass extends SuperClass {

    public SubClass() {
        // 親メソッドのコンストラクタの呼び出し
        super();
    }

    // superMethod()が継承される

    /**
     * 以下のように使える:
     * SubClass subClass = new SubClass();
     * subClass.superMethod();
     */

}