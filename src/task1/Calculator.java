package task1;

public class Calculator{

    static <T extends Number, V extends Number> Double sum(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    static <T extends Number, V extends Number> Double multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    static <T extends Number, V extends Number> Double divide(T num1, V num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    static <T extends Number, V extends Number> Double subtract(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
