import java.util.LinkedList;

class TestLinkedList{
	public static void main(String [] arg){
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Dog");
		ll.add("Cat");
		ll.add("Cow");
		
		//System.out.println("Linkedlist contains: "+ll);
		//System.out.println("Element of first index: "+ll.get(0));
		ll.set(2,"Horse");
		System.out.println("Linkedlist contains: ");
		for(int i=0;i<ll.size();i++){
			System.out.print(ll.get(i)+" ");
		}
	}
}