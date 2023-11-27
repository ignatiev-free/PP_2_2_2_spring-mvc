package web.model;

public class Car {

    private String model;
    private int horsepower;
    private  int price;


    public Car(String model, int horsepower, int price) {
        this.model = model;
        this.horsepower = horsepower;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

