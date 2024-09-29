package OOPSPart2Packages.StaticExample;

public class StaticE {

    public static void main(String[] args) {
    StaticE obj=new StaticE();
        obj.greeting();

        greet();

    }
     void greeting (){
        System.out.println("Hello");
    }
    public static void greet(){
        System.out.println("Namste ji");
    }
}
