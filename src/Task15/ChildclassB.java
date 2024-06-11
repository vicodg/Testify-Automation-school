package Task15;

public class ChildclassB extends ParentclassA {

    // Method 4
    void method4() {
        System.out.println("This is method4 from class B");
    }

    // Method 5
    void method5() {
        System.out.println("This is method5 from class B");
    }

    public static void main(String[] args) {
        // Creating an object of class B
        ChildclassB objB = new ChildclassB  ();

        // Invoking methods from class A
        objB.method1();
        objB.method2();
        objB.method3();

        // Invoking methods from class B
        objB.method4();
        objB.method5();
    }


}

