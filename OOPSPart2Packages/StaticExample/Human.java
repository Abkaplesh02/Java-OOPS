package OOPSPart2Packages.StaticExample;


//Static :: The properties that are not directly related to objects

//Whenever you are accessing static variable , modifying and declaring static variable => use class_name.static_variable . This is general convention.

//when a member is declared static , it can be accessed before any object of its class are created and without any reference to any object.
//We can declare both method and variable to be static.

//main() method is declared static because it must be called before any object exists.

//Static method in java is a method which belongs to the class and not to the objects.

//Static variable are not dependent on object , even if we have not created object , we can still access them.
//We know that something which is not static belong to an object.

//You cannot access non-static stuff, without referencing their instance in a static context.

//A static method can access only static data.This cannnot access not static data[instance variable].
//A non static member belong to an instance

//In a static context you don't have an instance that why you can't access non-static member without explicitly mentioning an object reference.
//In fact , we can access a non-static member in a static context by specifying the object reference explicitly.

//A static method can call only other static methods and cannot call non-static methods from it.
//A static method can be accessed directly by class name and doesn't need any object.

//A static method cannot refer to 'this' or 'super' keyword in anyway bcz they are used by non-static objects.

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
//    Ex of static : population:: this will be equal to all
    static long population;

    public Human(int age,String name, int Salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=Salary;
        this.married=married;
//       since population is not related to object and is same to all. We use class name to access it.
        Human.population+=1;
    }

}
