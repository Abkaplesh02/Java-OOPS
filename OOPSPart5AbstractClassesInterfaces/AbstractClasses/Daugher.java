package OOPSPart5AbstractClassesInterfaces.AbstractClasses;

public class Daugher extends Parent {

    public Daugher(int age){
        super(age);
    }

    @Override
    void career(String name){
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + "  and his age is :: " + age);

    }
}
