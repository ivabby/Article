
import java.util.ArrayList;
import java.util.Arrays;

public class Priority {
	
	//	Displaying article on the basis of priority
	public void display(ArrayList<String> articleName , ArrayList<Integer> priority) {
		
		int p[] = new int[articleName.size()];
		for(int i=0;i<p.length;i++)
			p[i] = priority.get(i);
		Arrays.sort(p);
		
		for(int i=0;i<articleName.size();i++)
		{
			int position = priority.indexOf(p[i]);
			System.out.println(articleName.get(position));
		}
	}
}
