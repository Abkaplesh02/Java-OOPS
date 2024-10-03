package OOPSPart5AbstractClassesInterfaces.AbstractClasses;

//The child class has to override all the abstract methods that are in parent class.
//bcz the method in parent class does not have a body.
public class Son extends Parent {

    public Son(int age) {
        super(age);
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a " + name);
    }

    @Override
    public void greet(){
        System.out.println("i have taken over ");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + "  and her age is :: " + age);

    }


}
