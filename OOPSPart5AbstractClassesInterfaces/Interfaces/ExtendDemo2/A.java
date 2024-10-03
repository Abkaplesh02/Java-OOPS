package OOPSPart5AbstractClassesInterfaces.Interfaces.ExtendDemo2;

public interface A {

//    Static interface methods should also have a body.
//    Call them via interface name.
    static void greeting(){
        System.out.println("Hey i am static method");
    }

    default void fun(){
        System.out.println("I am in A");
    };
}

//The access modifier for the overriden methods should be same or better.
//if the access modifier for the parent class was protected, for child class it must be same protected or public which is better than protected.
//It shouldn't be more protected or restricted like private.
