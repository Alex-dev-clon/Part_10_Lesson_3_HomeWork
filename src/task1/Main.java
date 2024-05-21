package task1;
/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы sum(), multiply(),
divide(), subtract(). Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("%.2f%n",Calculator.sum(12, 54.3f));
        System.out.printf("%.2f%n",Calculator.multiply(2.0, 5));
        System.out.printf("%.2f%n",Calculator.divide(50, 10f));
        System.out.printf("%.2f%n",Calculator.subtract(12, 2f));
    }
}
