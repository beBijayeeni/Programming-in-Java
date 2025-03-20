class Computer{
	class Processor{
		String brand;
		String processorBrand;
		double processorSpeed;
		public Processor(String brand, String processorBrand, double processorSpeed) {
			this.brand = brand;
			this.processorBrand = processorBrand;
			this.processorSpeed = processorSpeed;
		}
		void displayDetails(){
            System.out.println("--- Processor Details ---");
            System.out.println("Computer: " + brand);
            System.out.println("Processor Brand: " + processorBrand);
            System.out.println("Processor Speed: " + processorSpeed + " GHz");
        }
	}
}
class Q45{
	public static void main(String[] arg){
		Computer.Processor obj = new Computer().new Processor("HP Pavilion","Ryzen 5",3.5);
		obj.displayDetails();
	}
}