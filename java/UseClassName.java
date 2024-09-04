public class UseClassName {
    public static void main(String[] args) {
        ClassName obj = new ClassName(10, "Hello");

        obj.displayInfo(); // Output: Field1: 10, Field2: Hello

        obj.setField1(20);
        obj.setField2("World");

        obj.displayInfo(); // Output: Field1: 20, Field2: World
    }
}