class Initializer{
	static int initialValue;
	static{
		initialValue = 1000;
	}
}
class Q42{
	public static void main(String[] arg){
		// Print the value of initialValue before creating an instance
        System.out.println("Value of initialValue before creating instance: " + Initializer.initialValue);
        
        // Create an instance of Initializer
        Initializer obj = new Initializer();
        
        // Print the value of initialValue after creating an instance
        System.out.println("Value of initialValue after creating instance: " + Initializer.initialValue);
	}
}