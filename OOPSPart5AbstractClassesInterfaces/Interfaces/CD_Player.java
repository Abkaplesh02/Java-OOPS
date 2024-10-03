package OOPSPart5AbstractClassesInterfaces.Interfaces;

public class CD_Player  implements  Media{

    @Override
    public void start(){
        System.out.println("The music starts");
    }

    @Override
    public void stop(){
        System.out.println("The music stops");
    }

}
