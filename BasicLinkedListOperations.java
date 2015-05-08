import java.util.LinkedList;

public class BasicLinkedListOperations{
	
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Orange");
		ll.add("Apple");
		ll.add("Grape");
		ll.add("Banana");
		System.out.println(ll);
		    
		System.out.print("Size of the linked list" + ll.size());
		System.out.print("Is LinkedList empty? " + ll.isEmpty());
		System.out.print("Does LinkedList contains 'Grape'? :"+ ll.contains("Grape"));
		        
	}
}
