package Java_L_S_D_ooP.DZ.Dz_1;

import java.util.Scanner;

public class HotDrinkVendingMachine { 
    private HotDrinkTemperature product;

    public HotDrinkVendingMachine(HotDrinkTemperature product) {
        this.product = product;
    }

    public HotDrinkTemperature getProduct() {
        return product;
    }

    public void setProduct(HotDrinkTemperature product) {
        this.product = product;
    }

    public HotDrinkTemperature getProduct(String name, double volume, double temperature) {
        product.setName(name);
        product.setVolume(volume);
        product.setTemperature(temperature);
        return product;
    }
    // реализация меню
    public static String[] menu () {
        System.out.println("Выберите напиток:\n" +
                            "1 - Colla\n" +
                            "2 - Fanta\n" +
                            "3 - Sprite\n" +
                            "4 - Merinda\n");
        Scanner sk = new Scanner(System.in);
        int choice = sk.nextInt();

        System.out.println("Желаемый объем напитка:\n" +
                            "1 - 0.5л\n" +
                            "2 - 1.0л\n");
        int volum = sk.nextInt();

        System.out.println("Выберите температуоу напитка:\n" +
                                "1:  -5°\n" + 
                                "2:  0°\n" + 
                                "3:  5°\n"); 
        int temp = sk.nextInt();

        String[] prod = new String [3];
        for (int i = 0; i < prod.length; i++) {
            if (choice == 1) {
                prod[0] = "чай";
            } else if (choice == 2) {
                prod[0] = "кофе";
            } else if (choice == 3) {
                prod[0] = "кофе с молоком";
            } else if (choice == 4) {
                prod[0] = "какао";
            }
            else if (choice == 5) {
                prod[0] = "горячий шоколад";
            }
            if (volum == 1) {
                prod[1] = "0.2";
            } else if (volum == 2) {
                prod[1] = "0.5";
            } else if (volum == 3) {
                prod[1] = "0.7";
            }
            if (temp == 1) {
                prod[2] = "70";
            } else if (temp == 2) {
                prod[2] = "75";
            } else if (temp == 3) {
                prod[2] = "80";
            } else if (temp == 4) {
                prod[2] = "85";
            }
        }
        return prod;
    }




    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
            "name=" + product.getName() +
            ", volume=" + product.getVolume() +
            ", temperature=" + product.getTemperature() +
            '}';
    }
}
