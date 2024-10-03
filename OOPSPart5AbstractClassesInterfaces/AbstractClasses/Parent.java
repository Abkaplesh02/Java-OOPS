package OOPSPart5AbstractClassesInterfaces.AbstractClasses;

//if a class more than one abstract methods then it also needs to be declared as abstract.

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age=age;
    }

//    abstract Parent();
//    Abstract constructor are not allowed

//    Abstract methods

    abstract void career(String name);
    abstract void partner(String name , int age);

    static void hello(){
        System.out.println("Namaste DSA in java");
    }

    public void greet(){
        System.out.println("This is normal method ");
    }
}
