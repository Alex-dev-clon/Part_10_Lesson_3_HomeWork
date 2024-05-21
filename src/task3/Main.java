package task3;
/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Main {
    public static void main(String[] args) {
        Pair pair1 = new Pair("First", 1);
        Pair pair2 = new Pair(2.1, "Second");

        System.out.println(pair1.gerFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair2.gerFirst());
        System.out.println(pair2.getSecond());

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
