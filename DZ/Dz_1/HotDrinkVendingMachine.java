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


    public static String[] menu () {
        System.out.println("Выберите газировку:\n" +
                            "1 - Colla\n" +
                            "2 - Fanta\n" +
                            "3 - Sprite\n" +
                            "4 - Merinda\n");
        Scanner sk = new Scanner(System.in);
        int soda = sk.nextInt();

        System.out.println("Желаемый объем газировки:\n" +
                            "1 - 0.5л\n" +
                            "2 - 1.0л\n");
        int volum = sk.nextInt();

        System.out.println("Выберите температуру газировки:\n" +
                                "1:  -5°\n" + 
                                "2:   0°\n" + 
                                "3:   5°\n"); 
        int temp = sk.nextInt();

        String[] prod = new String[3];
        for (int i = 0; i < prod.length; i++) 
            {
                if (soda == 1) 
                    {
                        prod[0] = "Colla";
                    } 
                else if (soda == 2) 
                    {
                        prod[0] = "Fanta";
                    } 
                else if (soda == 3) 
                    {
                        prod[0] = "Sprite";
                    } 
                else if (soda == 4) 
                    {
                        prod[0] = "Merinda";
                    }



                if (volum == 1) 
                    {
                        prod[1] = "0.5";
                    } 
                else if (volum == 2) 
                    {
                        prod[1] = "1.0";
                    }


                
                if (temp == 1) 
                    {
                        prod[2] = "-5°";
                    } 
                else if (temp == 2) 
                    {
                        prod[2] = " 0°";
                    } 
                else if (temp == 3) 
                    {
                        prod[2] = " 5°";
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
