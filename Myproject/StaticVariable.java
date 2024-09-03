public class StaticVariable {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = StaticVariable.add(9, 3); // Calling the static method directly
        System.out.println("Result: " + result); // Output: Result: 8
    }
}