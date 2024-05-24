public class Task16 {

        // OVERLOADING: Create a method in a class and Overload in using
        // the 3 different ways of overloading that you know.
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        public static double calculateArea(int length, int width) {
            return length * width;
        }

        public static double calculateArea(double base, int height) {
            return 0.5 * base * height;
        }

        public static void main(String[] args) {
            double circleArea = calculateArea(5.0);
            double rectangleArea = calculateArea(4, 6);
            double triangleArea = calculateArea(3.0, 4);

            System.out.println("Area of circle: " + circleArea);
            System.out.println("Area of rectangle: " + rectangleArea);
            System.out.println("Area of triangle: " + triangleArea);
        }

}
