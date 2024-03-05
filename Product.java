package seminar1;

/*
 * Продукт
 */
public class Product {
    
    protected String name;

    protected String brand; 

    protected double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        processPrice(price);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        processName(name);
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        processBrand(brand);
    }




    private void processPrice(double price){
        if (price < 100){
            price = 250;
        }
        else {
            this.price = price;
        }
    }

    private void processName(String name){
        if (name == null || name.length() < 3){
            name = "<NAME>";
        }
        else {
            this.name = name;
        }
    }

    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            brand = "<BRAND>";
        }
        else {
            this.brand = brand;
        }
    }

    public Product(String brand, String name, double price){
        // if (brand == null || brand.length() < 3){
        //     brand = "<BRAND>";
        // }
        // else {
        //     this.brand = brand;
        // }
        processBrand(brand);
        // if (name == null || name.length() < 3){
        //     name = "<NAME>";
        // }
        // else {
        //     this.name = name;
        // }
        processName(name);

        // if (price < 100){
        //     price = 250;
        // }
        // else {
        //     this.price = price;
        // }
        processPrice(price);
    }

    public Product(String name, double price){
        this("<BRAND>", name, price);
        // if (price < 100){
        //     price = 250;
        // }
        // else {
        //     this.price = price;
        // }

        // if (name == null || name.length() < 3){
        //     name = "<NAME>";
        // }
        // else {
        //     this.name = name;
        // }
    }

    public Product(String name){
        this(name, 250);
        // if (name == null || name.length() < 3){
        //     name = "<NAME>";
        // }
        // else {
        //     this.name = name;
        // }
    }

    public Product(){
        this("<NAME>");
        // this.brand = "<BRAND>";
        // this.name = "<NAME>";
        // this.price = 250;
    }
    
    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }

}
