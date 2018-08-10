import java.util.ArrayList;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.omg.PortableServer.POAPackage.WrongAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArticleDetails {
	BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	Scanner scanner = new Scanner(System.in);
	//	Holds article name , content , date of creation , date of modification and priority
	ArrayList<String> articleName = new ArrayList<>();
	ArrayList<String> articleContent = new ArrayList<>();
	ArrayList<String> dateOfCreation = new ArrayList<>();
	ArrayList<String> dateOfModification = new ArrayList<>();
	ArrayList<Integer> priority = new ArrayList<>();
	ArrayList<String> article = new ArrayList<>();
	
	//	Fetch current date
	public String getDate() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date date = new Date();
		String Date = formatter.format(date);
		return Date;
	}
	
	//	Add a new Article
	public void add() throws IOException
	{
		System.out.println("Enter name of article to be added");
		String name = scanner.next();
		System.out.println("Enter content of article");
		String content = bReader.readLine();
		System.out.println("Enter priority of article");
		int priority = scanner.nextInt();
		
		//	fetch current date
		String Date = getDate();
		
		articleName.add(name);
		articleContent.add(content);
		this.priority.add(priority);
		dateOfCreation.add(Date);
		dateOfModification.add(Date);
	}
	
	//	Edit an article
	public void edit() throws IOException
	{
		System.out.println("Enter name of article to be edited");
		String name = scanner.next();
		if(articleName.contains(name))
		{
			System.out.println("Enter edited article");
			String content = bReader.readLine();
			int pos = articleName.indexOf(name);
			articleContent.set(pos, content);
			String Date = getDate();
			dateOfModification.set(pos, Date);
			System.out.println("Article edited successfully");
		}
		else
			System.out.println("No article with such name exist");
	}
	
	//	Remove an article
	public void remove() 
	{
		System.out.println("Enter name of article to be removed");
		String name = scanner.next();
		if(articleName.contains(name))
		{
			int position = articleName.indexOf(name);
			articleName.remove(position);
			//articleContent.remove(position);
			dateOfCreation.remove(position);
			dateOfModification.remove(position);
			articleContent.remove(position);
			System.out.println("Article removed successfully");
		}
		else
			System.out.println("No article with such name exist");
	}
	
	//	Display the list of articles
	public void display() {
		System.out.println("Enter 1 for displaying articles in order of articles created, 2 for articles modified or 3 for priority order:");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Article Name:"+articleName);
			System.out.println("Article Content:"+articleContent);
			break;
		case 2:
			ArticleModified articleModified = new ArticleModified();
			articleModified.display(articleName , articleContent, dateOfModification);
			break;
		case 3:
			Priority p = new Priority();
			p.display(articleName, articleContent ,priority);
		}
	}
	public void select() throws IOException {
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter 1 to add an article:\n 2 to edit an article:\n 3 to remove an article:\n 4 to display:\n 5 to Logout:");
			int choice = scanner.nextInt();
			switch (choice) 
			{
				case 1:
					add();
					break;
				case 2:
					edit();
					break;
				case 3:
					remove();
					break;
				case 4:
					display();
					break;
				default:
					flag = false;
			}
		}
	}
}
