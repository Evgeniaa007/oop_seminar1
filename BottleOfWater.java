package seminar1;

public class BottleOfWater extends Product{
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

@Override
    public String displayInfo() {
    // TODO Auto-generated method stub
        return String.format("Бутылка с водой \n\t [Наименование: %s \n\t Производитель: %s \n\t Стоимость: %.2f \n\t Объём: %.2f]", name, brand, price, volume);
    }

}
