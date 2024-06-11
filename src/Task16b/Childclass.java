package Task16b;


public class Childclass extends Parentclass {

    // Method 1 overridden
    @Override
    void method1(int num) {
        System.out.println("Child class method1 with argument: " + num);
    }

    // Method 2 overridden
    @Override
    void method2(String str) {
        System.out.println("Child class method2 with argument: " + str);
    }


}
