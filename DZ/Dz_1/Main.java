package Java_L_S_D_ooP.DZ.Dz_1;

public class Main {
    public static void main(String[] args) {
        String[] product = HotDrinkVendingMachine.menu(); 
        
        for (String item : product) 
            {
                System.out.println(item);
            }
        
        HotDrinkTemperature product1 = new HotDrinkTemperature(product[0], Double.parseDouble(product[1]), Double.parseDouble(product[2]));
        HotDrinkVendingMachine product2 = new HotDrinkVendingMachine(product1);
        System.out.println(product1);
        System.out.println(product2);


        product2.getProduct("mojito", 0.5, -5);
        System.out.println(product2);
        
    }
}
