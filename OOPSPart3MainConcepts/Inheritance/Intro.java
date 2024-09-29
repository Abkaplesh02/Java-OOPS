package OOPSPart3MainConcepts.Inheritance;

public class Intro {

    //super();  Object class
    double l;
    double h;
    double w;


    static void greeting(){
        System.out.println("Hey , i am in intro.");
    }


//    Default constructor
    Intro(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

//    Cube
//    If we need to find cube , this constructor will be called;
    Intro(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

//    Constructor for 3 arguements
    Intro(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
//Copy constructor secnario
    Intro(Intro other){
        this.l=other.l;
        this.h=other.h;
        this.w=other.w;
    }

    public void information(){
        System.out.println("Running the Intro");
    }

}
