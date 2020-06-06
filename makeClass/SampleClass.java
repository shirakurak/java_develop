// パッケージの宣言
// クラスを階層的に整理するために
package makeClass;

// クラス
public class SampleClass {

    // フィールド
    private String name = "Sample";
    
    // メソッド
    public String action() {
        return name + ">" + "Action";
    }
}


/**
 * パッケージ構成の例
 * Messangerアプリケーション
 * ・ユーザを管理するアカウント機能
 * ・ユーザが所属することができるグループ機能
 * ・実際にメッセージをやりとりするためのタイムライン機能
 * 
 * jp
 *  - co
 *      - messanger     // Messangerアプリケーション
 *          - account   // アカウント機能
 *              - AccountController.java
 *              - AccountService.java
 *          - group     // グループ機能
 *              - GroupController.java
 *              - GroupService.java
 *          - timeline  // タイムライン機能
 *              - TimeLineController.java
 *              - TimeLineService.java
 * 
 * パッケージの命名
 * 自分が所有しているドメイン名を逆にしたものから
 * パッケージ名を始める
 * 
 * 
 * 
 * 
 */


