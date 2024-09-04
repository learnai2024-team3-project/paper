package java;
public class FibonacciIterative {
    public void Fib(int n) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + " " + num2);

        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        FibonacciIterative fib = new FibonacciIterative();
        fib.Fib(10);
    }
}