public class Calculator {

    private int callCount = 0;

    public static int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        callCount++;
        return a * b;
    }

    public int getCallCount() {
        return callCount;
    }
}
