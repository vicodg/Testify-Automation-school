package Task13;

public class ClassB {
    public static void main(String[] args) {
        // Creating objects of class A using different constructors
                ClassA object1 = new ClassA();
                ClassA object2 = new ClassA  (5);
                ClassA object3 = new ClassA   (10, 20);

                // Displaying values of objects
                System.out.println("Value of object1: " + object1.getValue());
                System.out.println("Value of object2: " + object2.getValue());
                System.out.println("Value of object3: " + object3.getValue());


    }



}
