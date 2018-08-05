import java.util.Scanner;

public class Article {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		RegisterLogin registerLogin = new RegisterLogin();
		
		while(true)
		{
			System.out.println("Enter 1 for Register and 2 for Log In");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				registerLogin.Register();
				break;
			case 2:
				registerLogin.LogIn();
				break;
			default:
				break;
			}
		}
	}

}
