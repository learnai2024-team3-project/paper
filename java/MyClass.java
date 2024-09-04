package java;
public class MyClass {
    public int add(double a, int b) {
        return (int) a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int sumInt = myClass.add(3.5, 3); 
        double sumDouble = myClass.add(5.5, 3.5);
        System.out.println("Sum (int): " + sumInt);
        System.out.println("Sum (double): " + sumDouble);

        char c = 'a';
        int cc = c;
        System.out.println("c:" + cc);
    }
}