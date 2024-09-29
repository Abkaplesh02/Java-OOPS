package OOPSPart3MainConcepts.Inheritance;

public class IntroBox  extends Intro{
    double weight;

    IntroBox(){
    this.weight=-1;
    }

//    @Override
    static void greeting(){
        System.out.println("Hey , i am in introBox.");
    }

    IntroBox(double l , double h , double w, double weight){
         //What is this?
//        This is indicating to call the parent class constructor
//        used to initialise values present in parent class
        this.weight=weight;
//        super(l,h,w);
    }

    IntroBox(IntroBox other){
        super(other);
        this.weight=other.weight;
    }

    IntroBox(double side,double weight){
        super(side);
        this.weight=weight;
    }


}
