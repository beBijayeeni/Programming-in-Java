class IDGenerator{
	static int nextID = 0;
	static void generateID(){
		System.out.println(nextID);
		nextID++;
	}
}
class Q43{
	public static void main(String[] arg){
		IDGenerator.generateID();
	}
}