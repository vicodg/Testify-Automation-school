package Task14;

public class ClassB {
    public static void main(String[] args) {
       ClassA square = new ClassA ();

        // Set values for length and breadth
        square.setShapeLength(5.0);
        square.setShapeBreadth(5.0);

        // Calculate area
        double area = square.getShapeLength() * square.getShapeBreadth();

        System.out.println("The area of a square of length: " + square.getShapeLength() +
                " and breadth: " + square.getShapeBreadth() + " is " + area);

    }

}
