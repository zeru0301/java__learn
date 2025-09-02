package jp.co.internous.ecsite.model.dmain;

public class MstUser {
//	メンバー変数
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private String fullName;
	
	private int isAdmin;
	
//	メソッド
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void SetPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public int getIsAdmin() {
		return isAdmin;
	}

}
