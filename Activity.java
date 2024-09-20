public class Activity {

    public static void main(String[] args) {
         
        Dog edog = new Dog();
        edog.setNumberPuppies(2);

        Dog edog1 = new Dog();
        edog1.setName("von");
        edog1.isMale = true;

        Dog edog2 = new Dog();
        edog2.setName("Trice");
        edog2.isMale = false;

        edog.addPuppies(dog1);
        edog.addPuppies(dog2);

        edog1.Showname();
        edog2.Showname();

        edog1.bark();
        dog2.bark();

        edog.showNumberPuppies();

        edog.showAllPuppies();






 
    }
}