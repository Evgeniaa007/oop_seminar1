package seminar1;


public class Chips extends Product{

    private double weight;

    private String flavor;

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Chips(String brand, String name, double price, double weight, String flavor){
        super(brand, name, price);
        this.weight = weight;
        this.flavor = flavor;
    }



    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("Чипсы \n\t [Наименование: %s со вкусом %s \n\t Производитель: %s \n\t Стоимость: %.2f \n\t Вес: %.2f]", name, flavor, brand, price, weight);
    }
    
}
