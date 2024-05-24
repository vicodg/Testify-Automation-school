package Task19;

public class ClassC {
        String instanceMember = "Delta";

        public void printName(String name) {
            System.out.println("Instance member: " + this.instanceMember);
            System.out.println("User-entered name: " + name);
        }

        public static void main(String[] args) {
            ClassC obj = new ClassC();
            obj.printName("John");
        }

}
