package OOPSPart5AbstractClassesInterfaces.Interfaces.NestedInterface;

public class A {
//    nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
}
}

//The nested interface can be declared public protected or private.
//But top level interface has to be declared public or default.

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num){
        return (num & 1)==1;
    }
}


