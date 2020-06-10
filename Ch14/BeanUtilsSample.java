/**
 * Commons BeanUtils
 * リフレクションを用いたJava Beanの値の
 * 設定や取得などの処理を簡単にする
 * ユーティリティが含まれる。
 */

// MavenからCommons BeanUtilsを使う場合、
// pom.xmlの記述は以下のようになる：

// <dependency>
//     <groupId>commons-beanutils</groupId>
//     <artifactId>commons-beanutils</artifactId>
//     <version>1.9.2</version>
// </dependency>




// よく使うメソッド：
// BeanUtils.copyProperties
 
// すべてのフィールドの値コピーする場合
// public UseInfo(UserInfo orig) {
//     this.id = orig.id;
//     this.name = orig.name;
//     this.mail  = orig.mail;
// }

// 上記のコードを
// BeauUtils.copyPropertiesメソッドで置き換える：
// public UseInfo(UserInfo orig) {
//     BeanUtils.copyProperties(this, orig);
// }




