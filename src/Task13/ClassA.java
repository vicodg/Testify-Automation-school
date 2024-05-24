package Task13;

public class ClassA {
    public static void main(String[] args) {

    }

        private int value;

        // Constructor 1: Default constructor
        public ClassA() {
            System.out.println("Default constructor called");
            value = 0;
        }

        // Constructor 2: Constructor with one parameter
        public ClassA(int value) {
            System.out.println("Constructor with one parameter called");
            this.value = value;
        }

        // Constructor 3: Constructor with two parameters
        public ClassA(int value1, int value2) {
            System.out.println("Constructor with two parameters called");
            this.value = value1 + value2;
        }

        // Method to get the value
        public int getValue() {
            return value;
        }

}
