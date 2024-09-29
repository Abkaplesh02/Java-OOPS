package OOPSPart4AcessControl;

public class ObjectDemo {

    int num;
    Float gpa;

    public ObjectDemo(int num ,Float gpa){
        this.num=num;
        this.gpa=gpa;
    }
//We will go in details of how to create it in hashmap
//    hashcode :: number representation of an object.
//    unique representation of an object via a number.
//    This is random integer value formed using some algorithms.



    @Override
    public int hashCode(){
        return super.hashCode();
//        return this.num;
    }



    @Override
    public boolean equals(Object obj){
//        return super.equals(obj);
        return this.num==((ObjectDemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    @Override
    public String toString() {
        return "This is my string ";
    }
//    this is called when .toString is called in class or object.
//    this is toString representation.

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleted");;
    }
//    This get called when garbage collection hit


    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34,56.7f);
        ObjectDemo ob2=new ObjectDemo(34,66.7f);
//        System.out.println(obj.hashCode());
//        ObjectDemo obj2=new ObjectDemo(34);
 //        System.out.println(obj2.hashCode());
//        ObjectDemo obj3=obj2;
//        System.out.println(obj3.hashCode());


//        ObjectDemo obj4=new ObjectDemo(45,22,4f);
        if(obj==ob2){
            System.out.println("obj is equal to obj4");
        }

        if(obj.equals(ob2)){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj instanceof Object);
//        To check if the object is instance of this class or not.

//        object.getclass().   is used to get information about class is stored in heap memory.
        System.out.println(obj.getClass().getName());

    }
}
