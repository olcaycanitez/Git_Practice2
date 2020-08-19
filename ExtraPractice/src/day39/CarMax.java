package day39;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();


        car1.setCarInfo("Toyota", "Prius", 2011, "Black", 169200.3, 7000);
        car2.setCarInfo("BMW","X3", 2014, "WHITE", 59000, 15995);
        car3.setCarInfo("Lexus", "x350", 2018, "Black", 69200.3, 17000);
        car4.setCarInfo("Honda","Civic", 2017, "WHITE", 59000, 13995);
        car5.setCarInfo("Nissan", "Versa", 2014, "Blue", 40000, 6000);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car3.start();






    }
}
