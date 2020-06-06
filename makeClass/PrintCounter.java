package makeClass;

public class PrintCounter {

    // printメソッドが呼び出された回数
    public int count = 0;

    public void print() {
        count++;
        System.out.println("呼ばれた回数：" + count);
    }
    
}

    // 動確済み    
    // PrintCounter pc = new PrintCounter();
    // pc.print();
    // pc.print();
    // pc.print();
    // pc.count = 10;
    // pc.print();


/**
 * (1) クラスに指定できる修飾子
 * ・public　→　他のあらゆるクラスから参照可能
 * ・指定なし　→　同一パッケージ内のクラスから参照可能
 *              （パッケージプライベート）
 * 
 * (2) フィールド、メソッドに指定できる修飾子
 * ・public
 * ・protected  → 子クラス+同一パッケージ内のクラス
 * ・指定なし   → 同一パッケージ内のクラスのみ
 * ・private
 * 
 * 注意
 * 親パッケージクラス　→　パッケージプライべーど
 * そのクラスの持つメソッド　→　public
 * の場合は、呼び出せない。
 * 
 */
