package OOPSPart3MainConcepts.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Intro box=new Intro(4.6,7.8,2.3);
//        Intro box2=new Intro(box);
//        System.out.println(box.l + "  " + box.h + "  "+ box.w);
//        System.out.println(box2.l + "  " + box2.h + "  "+ box2.w);
//    IntroBox box3=new IntroBox();
//        System.out.println(box3.w + "  " + box3.h+ "  " + box3.weight);
//        IntroBox box4=new IntroBox(2,3,4,8);

        Intro box5=new IntroBox();
        System.out.println(box5.h);
        IntroBox box6=new IntroBox();
        System.out.println(box6.weight);
        System.out.println(box6.l);

        IntroBox box7=new IntroBox(box6);
//        System.out.println(box5.weight);
//        We can't access child class variables here.

//        We can create reference variable of parent class type and object of child class type.
//        We can access members of class of which reference variable is created.

//        But we can't create object with reference variable of child class and object of parent class type.
//        This is not allowed.
//        IntroBox box12=new Intro(2,3,4,6);

//        There are many variable in both parent and child classes.
//        You are given access to variables that are in reference type
//        You should have access to weight to weight variable.
//        This also means that ones you are tyring to acess should be initialised.
//        But here when the object itself is of type parent class, how will you call the call the constructor of child class.
//        This is why error.

//        Multilevel inheritance
//        IntroBoxWeight box8=new IntroBoxWeight();
        IntroBoxWeight box9=new IntroBoxWeight(5,12,88);

        Intro box10=new Intro();
        box10.greeting();

        Intro box11=new IntroBox();
        box11.greeting();


    }
}
