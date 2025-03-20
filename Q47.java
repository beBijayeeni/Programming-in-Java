class Car{
	void startEngine(){
		class Engine{
			void run(){
				System.out.println("Engine is running");
			}
		}
		Engine en = new Engine();
		en.run();
	}
}
class Q47{
	public static void main(String[] arg){
		Car c = new Car();
		c.startEngine();
	}
}