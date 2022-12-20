package Java_L_S_D_ooP.DZ.Dz_1;

public class HotDrinkTemperature extends HotDrink { 
    private double temperature;

    public HotDrinkTemperature(String name, double volume, double temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    
    @Override
    public String toString() {
        return "HotDrinkTemperature{" +
                "name=" + name +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}