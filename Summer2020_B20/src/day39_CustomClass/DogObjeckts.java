package day39_CustomClass;

public class DogObjeckts {


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Siwan", "Beagle", "Medium", 2, "Mix");
        dog2.setDogInfo("Roofus", "Argentinian Dogo", "Large", 1, "White");
        dog3.setDogInfo("Winston", "Scotties Terrier", "Small", 1, "Black");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");
        dog2.eat("Polo");
        dog3.eat("Steak");

        dog3.drink("Cola");
        dog1.drink("Milk");
        dog2.drink("Redbull");


        dog1.sleep("");
        dog2.sleep("");
        dog3.sleep("");




    }

}
