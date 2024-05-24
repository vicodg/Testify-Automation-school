package Task19;

public class ClassB extends ClassA {

    String name = "Anderson";

    public ClassB(String ballSize, String ballColour, String ballTexture) {
        super(ballSize, ballColour, ballTexture);
    }

    public static void main(String[] args) {
        ClassA objB = new ClassB();
        System.out.println("Value of name in class A: " + objB.super.name); // Accessing value from class A
        System.out.println("Value of name in class B: " + objB.name);
    }
    }

