package seminar1;

import java.util.List;

public class VendingMachine {
    
private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWaterRes = (BottleOfWater)product;
                //bottleOfWaterRes.getVolume();
                if(bottleOfWaterRes.getName().equals(name) && bottleOfWaterRes.getVolume() == volume){
                    return bottleOfWaterRes;
                }
            }
        }
        return null;
    }

    public Chips getPackOfChips(String brand, String flavor, double weight){
        for (Product product : products){
            if (product instanceof Chips){
                Chips chipsRes = (Chips)product;
                //chipsRes.getWeight();
                if(chipsRes.getBrand().equals(brand) && chipsRes.getFlavor().equals(flavor) && chipsRes.getWeight() == weight){
                    return chipsRes;
                }
            }
        }
        return null;
    }

}
