class House{
	void calculateArea(){
		class Room{
			double getArea(double length, double width){
				double area = length*width;
				return area;
				
			}
		}
		Room obj = new Room();
		double result = obj.getArea(4,5);
		System.out.println("The area is: "+result);
	}
}
class Q50{
	public static void main(String[] arg){
		House h = new House();
		h.calculateArea();
	}
}