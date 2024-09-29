package OOPSPart2Packages.staticBlock;

//Static Block:: If you need to do computation in order to initialise your static variable, you can declare a
// static block that get executed only once , when the class is first loaded.

//main method is static since it must be accessible for an application to run, before any instantiation takes place.

//Only nested classes can be static

//Static inner classes can have static variable.

//Independent classes which are outside or are not inside any other class cannot be static bcz they are already not dependent on any other class.

//Since static objects are not related to objects[objects are created/allocated at runtime]
//These static methods are resolved at complile time as they are class level methods.
//Static methods are class level methods , so it is always resolved during compile time.

//You can't override the inherited static methods as in java overriding takes place by resolving the type of object at runtime and not compile time. and then calling the respective method.

//Static interface methods are not inherited by either on implementing class or a sub interface.

public class block {

      class useStatic{
        static int a=3;
        static int b;
        static void meth(int x){
            System.out.println("x = " + x  );
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        static{
            System.out.println("Static block initialised");
            b=a*4;
        }
    }

    public static void main(String[] args) {
          useStatic.meth(55);
    }
}
