import java.util.TreeMap;

class TreeMapDemo{
	public static void main(String args[]){
		TreeMap<Integer, String> treeMap1 = new TreeMap<>();
		treeMap1.put(3,"A");
		treeMap1.put(2,"B");
		treeMap1.put(1,"C");
	    System.out.println(treeMap1);
		
		TreeMap<String, Integer> treeMap2 = new TreeMap<>();
		treeMap2.put("C",1);
		treeMap2.put("H",5);
		treeMap2.put("G",8);
	    System.out.println(treeMap2);
	}
}