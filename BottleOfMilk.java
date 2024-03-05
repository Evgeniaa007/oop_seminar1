
package seminar1;

import seminar1.Product;

public class BottleOfMilk extends Product{
    private double volume;

    private double fat;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }


    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

@Override
    public String displayInfo() {
    // TODO Auto-generated method stub
        return String.format("Бутылка с молоком \n\t [Наименование: %s \n\t Производитель: %s \n\t Стоимость: %.2f \n\t Объём: %.2f \n\t Жирность: %.2f]", name, brand, price, volume, fat);
    }
}
