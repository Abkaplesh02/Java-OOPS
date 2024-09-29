package OOPSPart2Packages.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Abhishek=new Human(23,"Abhishek",27000,false);
        Human Shubham=new Human(25,"Shubham",28000,true);
        Human Shaner=new Human(25,"Shaner",28000,true);
        Human Shiv=new Human(25,"Shib",28000,true);


        System.out.println(Abhishek.population);
        System.out.println(Human.population);

    }
}
