import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArticleModified {
	void display(ArrayList<String> articleName , ArrayList<String> articleContent , ArrayList<String> dateOfModification)
	{
		String date[] = new String[articleName.size()];
		for(int i=0;i<date.length;i++)
			date[i] = dateOfModification.get(i);
		Arrays.sort(date);
		
		for(int i=0;i<articleName.size();i++)
		{
			int position = dateOfModification.indexOf(date[i]);
			System.out.println("Name of Article:"+articleName.get(position));
			System.out.println("Content of Article:\n"+articleContent.get(position));
		}
	}
}
