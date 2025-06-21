import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo{
	public static void main(String args[]){
		//1st way => ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();//2nd way
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Boolean> list3 = new ArrayList<>();
		
		//add elements
		list1.add(0);
		list1.add(2);
		list1.add(3);
		System.out.println("List: "+list1);
		
		//get elements
		int element = list1.get(0);
		System.out.println("First element: "+element);
		
		//add elements in between
		list1.add(1,1);
		System.out.println("Adding e new element at 2nd index: "+list1);
		
		//modify elements
		list1.set(0,5);
		System.out.println("Modifying 1st index: "+list1);
		
		//remove elements
		list1.remove(3);
		System.out.println("Removing last element: "+list1);
		
		//size
		int size = list1.size();
		System.out.println("Size: "+size);
		
		//iterate
		System.out.println("List contains: ");
		for(int i=0; i<list1.size(); i++){
			System.out.println("\n"+list1.get(i));
		}
		
		//sorting
		Collections.sort(list1);
		System.out.println("After sorting: "+list1);
	}
}