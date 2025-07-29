public class Rectangle {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calcArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calcPerim() {
        return 2 * (length + breadth);
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calcArea());
        System.out.println("Perimeter: " + calcPerim());
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.displayDetails();
    }
}