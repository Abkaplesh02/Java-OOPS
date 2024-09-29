package OOPSPart4AcessControl;

public class Main {

    public static void main(String[] args) {
        A obj=new A(10,"abhishek" );


//        need to do few things
//        1.Acess the data members
//        2.Modify the data members

        System.out.println(obj.getNum());
//        System.out.println(obj.num);
//           num can't be accessed directly because it is private and can be accessed inside that class or using getter and setter.

        obj.setSum(12);
        System.out.println(obj.getNum());

//        Default access modifier:: This only allow in same package and not in any outside package.
//        public :: this allows everywhere.
//        private :: this allow only in same class or can be accessed using getter or setter.






//        Private;; This  is for sensitive data which you don't want direct access. This can be only accessed and modified using getter and setter methods that are public methods.
//        No Modifier: This is used for those variables which we don't want to be used outside package.
//        Protected:: This is used if we want the variables to accessed outside the package only if the class is subclass of  the creation class i'e; where the variable is created.
//        Only subclass can access the protected member in other packages in the bass class when it is outside the package.
//        In different packages with protected you are only able to access in sub class.
//        Public :: when we want our variable want to used anywhere in any package.



//        In built packages
//        1. lang package:: This contain stuff which is very essential for java . Stuff which is very mandatory to use. Java language specific stuff.Its automatically imported in files.
//        2. I/O::Input output.
//        3. Util :: utility classes :: this contains data structure and stuff and framework stuff.
//        4. applet:: this is used to create applets in java.
//        5. awt :: for Graphical user interface like buttons.
//        6. net:: You can also perform networking operations :: like connecting with internet.



//        Class Object is the root of the class hieraarchy.
//         Every class has object as a superclass.





    }
}
