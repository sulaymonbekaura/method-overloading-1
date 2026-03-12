public class MethodOverloadingBasic {

    // Same name — different parameter types
    static void print(int n)     { System.out.println("int: " + n); }
    static void print(double d)  { System.out.println("double: " + d); }
    static void print(String s)  { System.out.println("String: "" + s + """); }
    static void print(boolean b) { System.out.println("boolean: " + b); }

    // Same name — different parameter count
    static int add(int a, int b)           { return a + b; }
    static int add(int a, int b, int c)    { return a + b + c; }
    static double add(double a, double b)  { return a + b; }
    static String add(String a, String b)  { return a + b; }

    // Area calculations — overloaded
    static double area(double side)                { return side * side; }          // square
    static double area(double width, double height) { return width * height; }      // rectangle
    static double area(double base, double height, boolean isTriangle) {
        return isTriangle ? 0.5 * base * height : base * height;
    }

    public static void main(String[] args) {
        System.out.println("=== Overloaded print() ===");
        print(42);
        print(3.14);
        print("Hello");
        print(true);

        System.out.println("\n=== Overloaded add() ===");
        System.out.println("add(3, 4)        = " + add(3, 4));
        System.out.println("add(1, 2, 3)     = " + add(1, 2, 3));
        System.out.println("add(1.5, 2.5)    = " + add(1.5, 2.5));
        System.out.println("add("Hi"," World")= " + add("Hi"," World"));

        System.out.println("\n=== Overloaded area() ===");
        System.out.printf("Square (5)           = %.2f%n", area(5.0));
        System.out.printf("Rectangle (4×6)      = %.2f%n", area(4.0, 6.0));
        System.out.printf("Triangle (b=6, h=4)  = %.2f%n", area(6.0, 4.0, true));
    }
}
