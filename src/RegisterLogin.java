import java.util.Scanner;

public class RegisterLogin {
	UserDetails userDetails = new UserDetails();
	Scanner scanner = new Scanner(System.in);
	ArticleDetails articleDetails = new ArticleDetails();
	
	//	Registering new user
	public void Register() {
		System.out.println("Enter user name:");
		String userName = scanner.next();
		System.out.println("Enter password:");
		String password = scanner.next();
		userDetails.add(userName, password);
	}
	
	//	Log in user
	public void LogIn() {
		System.out.println("Enter user name:");
		String userName = scanner.next();
		System.out.println("Enter password:");
		String password = scanner.next();
		
		if(userDetails.userName.contains(userName))
		{
			int position = userDetails.userName.indexOf(userName);
			String mPassword = userDetails.password.get(position);
			if(mPassword.equals(password))
			{
				System.out.println("Successfully Logged In");
				articleDetails.select();
			}
			else
				System.out.println("Incorrect password");
		}
		else
			System.out.println("Invalid User Name");
	}
}
