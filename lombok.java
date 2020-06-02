// Java言語の不満点としてのアクセサメソッド
// [java dev] No.297-

// 普通の書き方
class Foo{
	private String userName;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}
}

// Lombok
class Foo{
	@Setter @Getter
	private String userName;
}
