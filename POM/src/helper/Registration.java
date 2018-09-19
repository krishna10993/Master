package helper;

public interface Registration {
	void login(String uname,String pwd);
	void signup(String uname,String pwd, String city, int pincode);
	String forgotPwd(String uname);
}
