package OOPSPart3MainConcepts.Polymorphism;

public class Circle extends Shapes{
//    This is overriding.
//    creating method with same name as in parent's class with different body.
//    Overriding
//    This will run when obj of circle is created
//    hence it is overriding the parent method

    @Override //This is called annotion
//    This is used to check if method is being overriden or not.

    void area(){
        System.out.println("Area is pie * r * r");
    }
}
