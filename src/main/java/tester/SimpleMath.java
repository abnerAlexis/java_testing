package tester;

public class SimpleMath {

    public int Add(Integer first, Integer second) {
        if (first == null || second == null) {
            throw new NullPointerException("Arguments cannot be null.");
        }
        return first + second;
    }

    public int Subtract(Integer first, Integer second) {
        return first - second;
    }

    public int Multiply(Integer first, Integer second) {
        return first * second;
    }

    public int Divide(Integer first, Integer second) {
        return first / second;
    }
}
