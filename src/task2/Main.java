package task2;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину
и должны содержать элементы одного типа
 */
public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Animal(), new Animal()};
        Animal[] animalsCats = {new Cat(), new Cat()};
        Cat[] cats = {new Cat(), new Cat()};
        Dog[] dogs = {new Dog(), new Dog()};

        System.out.println(compareArrays(animals, animalsCats));
        System.out.println(compareArrays(cats, animalsCats));
        System.out.println(compareArrays(cats, dogs));
    }

    static <T,V> boolean compareArrays (T[] arr1, V[] arr2){
        if (arr1.length == arr2.length){
            return arr1[0].getClass().getSimpleName().equals(arr2[0].getClass().getSimpleName());
        }
        return false;
    }
}
