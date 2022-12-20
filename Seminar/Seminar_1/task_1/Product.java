package Java_L_S_D_ooP.Seminar.Seminar_1.task_1;

public class Product {
    protected String name;
    protected double price;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void doSmth () {
        System.out.println("Это класс товар");
    }

    public String doSmth (String string) {
        System.out.println("String");
        return "String";
    }

    public String doSmth (Integer string) {
        System.out.println("Integer");
        return "Integer";
    }

    public String doSmth (Object string) {
        System.out.println("Object");
        return "Object";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
