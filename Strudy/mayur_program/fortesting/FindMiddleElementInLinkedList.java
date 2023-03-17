package fortesting;
import java.util.LinkedList;
import java.util.List;
 
public class FindMiddleElementInLinkedList {
	/**
	 * @author Crunchify.com
	 */
	public static void main(String[] args)
        {
		List<String> list = new LinkedList<String>();
                
                list.add("Mayur1");
                list.add("Mayur2");
                list.add("Mayur3");
                list.add("Mayur4");
                list.add("Mayur5");
                list.add("Mayur6");
                list.add("Mayur7");
                list.add("Mayur8");
                list.add("Mayur9");
                list.add("Mayur10");
                int size = list.size();
		int middle = (size / 2);
		String t = list.get(middle).toString();
		System.out.println("Middle Element of Linked List is: " + t);
	}
 
	
}