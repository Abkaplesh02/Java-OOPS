package OOPSPart2Packages.SingletonCLass;

//Singleton Class :: If we have class and only want one instance of that class to be created , then it can be called Singleton class.

public class Singleton {

   private Singleton(){

   }
//   The constructor is declared private so that it can't be accessed from outside the class and no other object can be created.

   private static Singleton instance;
//   This is declaring object named instance which will store the reference of created object.

//    This method will be called from outside to create object. this method will chaeck if object is created then it will
//    pass the reference of it and if not created it will create object and pass it's referenc to all new objects creating using this  class.
//    They all will be refering to the same object.
    
   public static Singleton getInstance(){
       if(instance ==null){
           instance=new Singleton();
       }
       return instance;
   }

}

