package Java_L_S_D_ooP.Seminar.Seminar_1.task_1;

public class Item extends Product{
    private double weight;

    public Item (String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doSmth() {
        System.out.println("Это класс элемент");
        weight += 1;
    }
}
