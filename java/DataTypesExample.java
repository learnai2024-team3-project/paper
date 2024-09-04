package java;

// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello world!");
//     }
// }

public class DataTypesExample {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;

        String str = "Hello, Java!";
        int[] arr = {1, 2, 3, 4, 5};

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Matrix: ");
        for (int ii = 0; ii < matrix.length; ii++) { 
            for (int j = 0; j < matrix[ii].length; j++) { 
                System.out.print(matrix[ii][j] + " ");
            }
            System.out.println(); 
        }
    }
}
