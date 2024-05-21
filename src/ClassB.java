public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();

        String returnedName = classA.getName("ODOGWU");

        System.out.println(returnedName);
    }
}
