package OOPSPart3MainConcepts.Inheritance;


//Multilevel inheritance

public class IntroBoxWeight extends  IntroBox{

    double cost;

    IntroBoxWeight(){
        super();
        this.cost=-1;
    }

    IntroBoxWeight(IntroBoxWeight other){
        super(other);
        this.cost=other.cost;
    }

    IntroBoxWeight(double l, double h, double w, double weight,double cost){
        super(l,h,w,weight);
        this.cost=cost;
    }

    IntroBoxWeight(double side, double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }


}
