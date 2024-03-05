package seminar1;

import java.util.ArrayList;

public class Program{
    public static void main(String[] args) {
        
       //Product product1 = new Product("Brand #1", "Name #1", 200);
    //    Product product1 = new Product("1", "", -1500);
    //    System.out.println(product1.displayInfo());
    //    product1.brand = "Brand #1";
    //    product1.name = "Name #1";
    //    product1.price = 200;
        Product product1 = new Product();
        //System.out.println(product1.displayInfo());

        //product1.setPrice(-1400);
        //System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("Brand 2", "Name 2", 100, 0.5);
        //System.out.println(bottleOfWater1.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand 3", "Name 3", 150, 1, 10);
        //System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand 4", "Name 4", 150, 0.9, 1.5);
        //System.out.println(bottleOfMilk2.displayInfo());
       

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfMilk1);
        list.add(new BottleOfMilk("Простоквашино", "Бубу", 139, 1.4, 3.2));
        list.add(new Chips("Lays", "Из печи", 159, 0.4, "Ребрышки барбекю"));
        list.add(new Chips("Lays", " ", 175, 0.8, "Краб"));
        list.add(new Chips("Lays", "Стакс", 123, 0.4, "Сыр"));
        list.add(new Chips("Lays", "Из печи", 145, 0.6, "Ребрышки барбекю"));
        list.add(new Chips("Cheetos", "Кукурузный снэк", 159, 0.4, "Ветчина и сыр"));


        VendingMachine vendingMachine = new VendingMachine(list);
        /*
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name 2", 0.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else{
            System.out.println("Такой бутылки с водой нет в автомате");
        }
        */
        Chips chipsRes = vendingMachine.getPackOfChips("Lays", "Ребрышки барбекю", 0.4);
        if (chipsRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chipsRes.displayInfo());
        }
        else{
            System.out.println("Таких чипсов нет в наличии");
        }
        
        Chips chipsRes1 = vendingMachine.getPackOfChips("Русская картошка", "Сметана и лук", 0.8);
        if (chipsRes1 != null){
            System.out.println("Вы купили: ");
            System.out.println(chipsRes1.displayInfo());
        }
        else{
            System.out.println("Таких чипсов нет в наличии");
        }

    }
}