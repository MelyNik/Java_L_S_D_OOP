package Java_L_S_D_ooP.Seminar.Seminar_1.task_1;

// Реализуйте класс Product (товар), содержащий данные о товаре, и VendingMachine 
// (торговый автомат), содержащий в себе методы 
// initProducts (List <Product>) и 
// getProduct (String name)
// Реализовать конструкторы, get/set методы, построить логику VendingMachine на основе 
// кода реализованного в задании 1.
// Реализовать наследника класса Product, добавив новому классу доп переменную 
// (например вес или объем напитка).

// *Реализовать наследника класса VendingMachine , продающий только конкретный 
// продукт.
// Реализовать у класса VendingMachine, метод void restore() и реализовать логику. 
// Создать в main список из нескольких объектов VendingMachine и нескольких объектов 
// его наследников. 
// Вызвать метод restore() для каждого элемента в списке.
// Переопределить метод restore() у потомков и повторить пункт 3

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Product> productList = new ArrayList<>();
        productList.add(new Product("Fanta", 100));
        productList.add(new Item("Sprite", 100, 0.5));

        // for (Product product : productList) {
        //     product.doSmth();
        // }

        List <VendingMachine> vm = new ArrayList<>();
        vm.add(new VendingMachine());
        vm.add(new Drinks());

        // for (VendingMachine item : vm) {
        //     item.restore();
        // }

        List <Object> prod = new ArrayList<>();
        prod.add("");
        prod.add(1);
        prod.add(new Object());

        for (Object object : prod) {
            new Product("Fanta", 100).doSmth(object);
        }
    }
}