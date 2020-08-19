package day39;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car();
/*
        car1.brand = "Toyota";
        car1.model = "Prius";
        car1.year = 2011;
        car1.color = "Black";
        car1.milage = 169200.3;
        car1.price = 6000;

        System.out.println(car1.brand); // toyota
*/

        car1.setCarInfo("Toyota", "Prius", 2011, "Black", 169200.3, 7000);

        car1.getCarInfo();

//        System.out.println(car1.brand);
//        System.out.println(car1.model);
//        System.out.println(car1.year);
//        System.out.println(car1.color);

        Car car2 = new Car();

        car2.setCarInfo("BMW", "X3", 2014, "WHITE", 58261, 15995);

        car2.getCarInfo();

    }

}
