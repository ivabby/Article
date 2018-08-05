import java.util.ArrayList;

public class UserDetails {
	ArrayList<String> userName = new ArrayList<>();
	ArrayList<String> password = new ArrayList<>();
	
	//	ADDS NEW USER
	public void add(String userName , String password) {
		this.userName.add(userName);
		this.password.add(password);
	}
}
