class Parent {
    private int privateData;

    // Constructor
    public Parent(int privateData) {
        this.privateData = privateData;
    }

    // Getter method for privateData
    public int getPrivateData() {
        return privateData;
    }

    // Setter method for privateData
    public void setPrivateData(int privateData) {
        this.privateData = privateData;
    }
}

class Child extends Parent {

    // Constructor
    public Child(int privateData) {
        super(privateData);
    }

    // Method to display privateData
    public void displayPrivateData() {
        System.out.println("Private Data: " + getPrivateData());
    }
}

class  GetterSetter{
    public static void main(String[] args) {
        Child child = new Child(42);
        child.displayPrivateData(); // Output: Private Data: 42

        // Modifying private data using setter
        child.setPrivateData(100);
        child.displayPrivateData(); // Output: Private Data: 100
    }
}
