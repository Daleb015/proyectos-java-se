package aprenderaprogramar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;



public class Test {
	
	public static void main(String[] args)
	{
		
		ArrayList<Set> milista = new ArrayList<Set>();
		
		Set<String> miset = new HashSet<String>();
		
		miset.add("Sol");
		miset.add("Luna");
		miset.add("Saturno");
		
		Set miarbol = new TreeSet();
		
		miarbol.add(2);
		miarbol.add(8);
		miarbol.add(5);
		
		milista.add(miset);
		milista.add(miarbol);
		
		Iterator<Set> it =milista.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
