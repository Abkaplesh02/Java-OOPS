package OOPSPart5AbstractClassesInterfaces.AbstractClasses;

//Abstract Methods ::: Empty methods in parent class which any of it's child can use after overrding it.

//Any class that contains one or more abstract methods :: this should be declared as abstract.

public class Main {

    public static void main(String[] args) {
        Son son=new Son(23);
        System.out.println(son.age);
        son.career("Programmer");
        Daugher daugher=new Daugher(12);
        daugher.career("Star");

//        Parent p1=new Parent(32);
//        Parent' is abstract;
//        cannot be instantiated
//        Bcz if we create body of abstarct class , and it calls a abstract method it will give error.
//        The same reason is for we cannot create abstarct constructor.

//        Can we create abstact static methods::?
//        No , because abstarct methods are meant to be overriden and static methdos can't be overriden , so we can't create abstract static methods.

//        Can we create static methods in abstarct classes?
//        yess we can, bcz no object is allowed for abstract classes and we can call static methods directly with class name without objects.

        Parent.hello();

//        can abstract methods contain normal methods
//        yes

        son.greet();
        daugher.greet();

        Parent p1=new Son(23);


    }
//
}
