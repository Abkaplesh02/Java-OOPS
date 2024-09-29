package OOPSPart2Packages.SingletonCLass;

public class main {
    public static void main(String[] args) {
//        Singleton obj=new Singleton();
//        This gives error bcz constructor of singleton is made private to be accessed by class only and not by outside things.

        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

//        These both variable are pointing to same object , which singleton class created and is returning it to all object's reference.
    }
}
