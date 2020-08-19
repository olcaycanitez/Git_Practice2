package day39;
/*
        Attributes:
            model, brand, year, color, mileage, price
     */

public class Car {
    String brand;
    String model;
    int year;
    String color;
    double milage;
    double price;

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor, double carMilage, double carPrice){

        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        milage = carMilage;
        price = carPrice;

    }

    public void getCarInfo(){
        System.out.println(year +" "+ brand +" "+ model +", "+ color +", "+ milage +", $"+ price);
    }

    public void start(){
        System.out.println(brand + " " + model + " is started");
    }




}
