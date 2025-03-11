import java.util.Scanner;

class Distance {
    int feet;
    int inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    Distance(Distance other) {
        this.feet = other.feet;
        this.inches = other.inches;
    }
	void acceptDistance(int f, int inc){
		feet=f;
		inches=inc;
	}

    void showDistance() {
        System.out.println(feet + " feet, " + inches + " inches");
    }

    Distance addDistance(Distance other) {
        int totalInches = (this.feet * 12 + this.inches) + (other.feet * 12 + other.inches);
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        return new Distance(feet, inches);
    }

    Distance subtractDistance(Distance other) {
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = other.feet * 12 + other.inches;
        if (totalInches1 < totalInches2) {
            System.out.println("Error: The second distance is larger than the first one.");
            return new Distance();
        }
        int totalInches = totalInches1 - totalInches2;
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        return new Distance(feet, inches);
    }

    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }

    public static void main(String[] args) {
        Distance distance1 = new Distance(5, 10);
        Distance distance2 = new Distance(3, 4);
        
        System.out.println("Distance 1:");
        distance1.showDistance();
        System.out.println("Distance 2:");
        distance2.showDistance();
        
        Distance resultAdd = distance1.addDistance(distance2);
        System.out.println("Sum of Distance 1 and Distance 2:");
        resultAdd.showDistance();
        
        Distance resultSubtract = distance1.subtractDistance(distance2);
        System.out.println("Difference between Distance 1 and Distance 2:");
        resultSubtract.showDistance();
        
    }
}
