package OOPSPart5AbstractClassesInterfaces.Interfaces;

public class Main {

    public static void main(String[] args) {

        Car car=new Car();

        Engine car1=new Car();
//        car1.brake();
//        We can't access brakes because we can only access methods that are of Engine interface or class.
//        The object type can only tell us about which version of that method to acess.
        car.brake();
        car.acc();
        car.start();
        car.stop();

        Media car2=new Car();
        car2.stop();


        System.out.println();
        System.out.println();
        NiceCar car4= new NiceCar();
        car4.start();
        car4.startMusic();
        car4.stopMusic();
        car4.upgradeEngine();
        car4.start();
        car4.stop();


    }
}


//Interfaces contain abstract function.
//They are like class but not completely .
//we can't create their object.
//variables are static and final by default in interfaces.
//Interfaces specify what the classes are doing and not how it is doing
//Every single method is abstract.
//Interfaces can only have abstract method.

//Abstract class can provide the implementation of interface.
//But interface can't provide implementation of abstract class.

//Inheritance vs abstraction
//Java interface can be implemented using implements keyword using here and in abstract class we use extends keyword.
//We can implement multiple interface together, an interface can implement another java interface.
//An abstract class can extend only single class.
//Member of java interface are public by default and the java abstract class can have all kind(public , private etc)
//A class can implement multiple interfaces but a class can inherit only single class.
//In interface we don't have instance variables , we have final and static variables.

//Interface are not in heriachy of classes.

//Don't use interface in perfomance critical code.
