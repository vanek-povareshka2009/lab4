package org.example;
import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        System.out.println("№1");
//        Integer[] arr1 = {5, 3, 7, 9, 6 , 1};
//        String[] arr2 = {"q", "w", "e","r", "t"};
//        System.out.println(Arrays.toString(arr1));
//        swapElements(arr1, 0,1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        swapElements(arr2, 3,4);
//        System.out.println(Arrays.toString(arr2));



        //System.out.println("----------------------");
        Box<Apple> appleBox1 = new Box<>(new Apple());
        Box<Orange> orangeBox1 = new Box<>(new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<>(new Orange());
        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple());

        appleBox1.add(new Apple());
        appleBox1.add(new Apple());



        // Сравниваем коробки
//        System.out.println("Сравнение коробки яблок и коробки апельсинов: " + appleBox1.compare(orangeBox));
//        System.out.println("Сравнение сравнение второй коробки яблок и апельсинов: " + appleBox1.compare(appleBox2));appleBox2


        // Выводим содержимое коробок до перемещения
        System.out.println("\n\nСодержимое первой коробки с яблоками весом " + appleBox1.getWeight() + "f :");
        appleBox1.printBox();
        appleBox1.getWeight();
        System.out.println("Содержимое второй коробки с яблоками весом " + appleBox2.getWeight() + "f :");
        appleBox2.getWeight();
        appleBox2.printBox();



        appleBox1.moveTo(appleBox1);
        // Выводим содержимое коробок после перемещения
        System.out.println("\nСодержимое первой коробки с апельсинами весом " + appleBox1.getWeight() + "f после перемещения:");
        appleBox1.printBox();


        Box<Banana> bananaBox1 = new Box<>();
        Box<Banana> bananaBox2 = new Box<>();

//        bananaBox1.add(new Banana());
//        bananaBox2.moveTo(bananaBox1);
//        bananaBox2.moveTo(bananaBox2);
    }
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    private static <C> List<C> convertToList(C[] array){
        return Arrays.asList(array);
    }
}