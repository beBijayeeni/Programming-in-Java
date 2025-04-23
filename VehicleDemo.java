import java.util.*;
class Vehicle{
	private String brand;
	private String country_of_origin;
	private double base_price;
	
	// Constructor
    Vehicle(String brand, String country_of_origin, double base_price) {
        this.brand = brand;
		this.country_of_origin = country_of_origin;
		this.base_price = base_price;
    }

    /* Getter method for privateData
    public int getPrivateData() {
        return brand;
		return country_of_origin;
		return base_price;
    }*/
	
	public double getBase(){
		return base_price;
	}

    // Setter method for privateData
    public void setPrivateData(String brand, String country_of_origin, double base_price) {
        this.brand = brand;
		this.country_of_origin = country_of_origin;
		this.base_price = base_price;
    }
	void input(){
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter brand: ");
		brand = in1.nextLine();
		System.out.println("Enter country of origin: ");
		country_of_origin = in1.nextLine();
		System.out.println("Enter base price: ");
		base_price = in1.nextDouble();
	}
	void display(){
		System.out.println("Vehicle Details");
		System.out.println("===============");
		System.out.println("Brand: "+brand);
		System.out.println("Country of Origin: "+country_of_origin);
		System.out.println("Base Price: "+base_price);
	}
}
class Car extends Vehicle{
	String model;
	int speed;
	double market_price;
	// Constructor
    Car(String brand, String country_of_origin, double base_price) {
        super(brand);
		super(country_of_origin);
		super(base_price);
    }
	
	public void Base() {
        double base_data = getBase();
    }
	
	void read(){
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter model: ");
		model = in2.nextLine();
		System.out.println("Enter speed in km/hr: ");
		speed = in2.nextInt();
	}

	double calculate_market_price(){
		if (speed>80){
			market_price = base_data + ((base_data * 15) / 100);
		}
		else{
			market_price = base_data - ((base_data * 5) /100);
		}
		
		return market_price;
	}
	
	// Method to display
    public void displayCar() {
		System.out.println("Car Details");
		System.out.println("===============");
        System.out.println("Car Model: " +model);
		System.out.println("Speed: "+speed);
		System.out.println("Market Price: "+calculate_market_price());
    }
}
class VehicleDemo{
	public static void main(String[] arg){
		Vehicle obj1 = new Vehicle();
		obj.display();
		Car obj2 = new Car();
		obj2.displayCar();
	}
}