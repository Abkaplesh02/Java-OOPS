package OOPSPart3MainConcepts.Polymorphism;

public class ObjectPrint {

    int num;
    public ObjectPrint(int num){
        this.num=num;
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(54);
        System.out.println(obj);
    }

    @Override
    public String toString(){
        return "ObjectPrint{" +
                "num=" + num +
    '}';
    }
}
