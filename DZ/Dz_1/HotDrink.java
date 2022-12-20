package Java_L_S_D_ooP.DZ.Dz_1;

// 1. Создать наследника реализованного класса HotDrink с дополнительным полем int температура.

// 2. Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine и реализовать 
// перегруженный метод getProduct(String name, double volume, double temperature), 
// выдающий продукт соответствующего имени, объема и температуры.

// 3. В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и 
// воспроизвести логику заложенную в программе.

// 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.




public class HotDrink { 
    protected String name;
    protected double volume;

    public HotDrink(String name, double volume) {
        this.volume = volume;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
