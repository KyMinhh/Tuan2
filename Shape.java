public class Shape {
    public double calculateArea() {
        return 0.0;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println("The area of Circle is: " + circle.calculateArea());
        System.out.println("The area of Rectangle is: " + rectangle.calculateArea());
    }
}
