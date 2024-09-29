package oopsIntroduction;

public class IntroPractical {
    public static void main(String[] args) {



//    CLass :: A class is named group of properties or function
//    class is used to create our own datatype
//    A class is an template for an object.
//    An object is an instance of a class.
//    class creates dataType that are used to create object.
//    A class is logical construct.
//    Object is physical reality.


//    3 Essential properties of object:
//    1. State of object[value from datatype]
//    2.Identity of object[where is stored]
//    3.Behaviour of object[effect of dataType operation]


//    Student s1;
//     Declaring Reference variable:   This is declaring reference variable to object of Student class.This is not creating of an object. This is just reference to object of type student.This time the reference variable does not point to any object. It is just in stack memory.Untill it is assigned any object it stores null value in it.
//    When we try to print it without assigning object , it gives compile time error of arary not initialised or print null everytime.

//    Instance variable: Variable that are declared inside the class
//    Reference variable: In Java, a reference variable is a variable that holds the memory address of an object rather than the actual object itself.

//    .Dot variable links the Reference variable of object with instance variable of the class. They are used to acess instance variable.
//    new Operator: This is used to create objects. This dynamically allocates the memory at runtime and returns a refernce to it which is stored in reference variable.
//    Dynamic memory allocation: When memory is allocated during runtime.
//    If dataType starts with capital letter , then it is class itself . Ex: String.

//    Constructor: This defines what happens when your object will be created. This is by default function.No return type , bcz the type of class is itself return type.
//    Constructor is special type of funciton that runs when you create an object and it allocate some memory for object in memory.
//    The constructor is called when object of class is created.This can be used to set initital values for object attributes.
//    It is not necessary to write a constructor for a class. It is because the java compiler creates a default constructor (constructor with no arguments) if your class doesn’t have any.


//    This : Replacing this with name of reference variable.
//    This is used to refer to the current object and replace this with current object reference variable.

//    When we create an object of a class , class is being instantiated.
//    Instantiation: This is process of creating an instance of class , which means allocating memory for the object and intializing its attributes.


//    create a student class with instance variable in it .
    class Student{
        String name;
        int rollNo;
        float DsaMarks;
        boolean DevProject;

//       name rollNo DsaMarks DevProject are instance variable

        Student(){
            System.out.println("This is default constructor");
            this.name="Abhishek ";
            this.rollNo=2001;
            this.DevProject=true;

        }
//        This is parametered constructor
//        This is used to refer to the current object and replace this with current object's reference variable.
        Student(String name, int rollNo, float DsaMarks, boolean DevProject){
            this.name=name;
            this.rollNo=rollNo;
            this.DsaMarks=DsaMarks;
            this.DevProject=DevProject;
        }

//        Function overloading: calling same function with different number of arguements.
//        Ex : constructor with zero arguements , then constructor with all arguements.


//        This is copy constructor
//        passing one object into another object
        Student(Student other){
            this.name=other.name;
            this.rollNo=other.rollNo;
            this.DsaMarks=other.DsaMarks;
            this.DevProject=other.DevProject;
        }


    }



//    Create a object of student class;
    Student s1=new Student();

//    s1 is reference variable pointing to object created of student class.
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.DsaMarks);
        s1.DevProject=false;
        System.out.println(s1.DsaMarks);
        System.out.println(s1.DevProject);

        Student s2=new Student("Abhishek Kaplesh" , 2010991446, 88.3f , true);
//        This is showing error because only default constructor is there in object which takes 0 arguements and is called on it's on during object creation.
//        we need to create constructor with parameters to intake this statment.
//        Now after creating parametered constructor , this is not giving any error and will create object of student class.
        System.out.println(s2.name);
        System.out.println(s2.rollNo);

        Student s3;
//       This is declaring reference variable to object of Student class.
//       This is not creating of an object.
//       This is just reference to object of type student.
//       This time the reference variable does not point to any object.
//       It is just in stack memory.Untill it is assigned any object it stores null value in it.
//        if we trie to print it will give null or error .

//        Sometimes a method will need to referred to the object that invoked it.
//        To allow this , java defines this keyword. This can be used inside any method to
//        refer to the current object. This is always a reference to the object on which the method was invoked.


//        Finalize method:: Sometimes an object will need to perform some action when it is destroyed . To handle such situations
//        , java provides a mechanism called Finalization.
//        By using finalization , you can define specific actions that will occur when an object is about to be reclaimed by the garbage collector.
//        To add finalizer method to the class , you simply define the finalize method.
//        The java Runtime calls that method whenever it is about to recycle an object of that class.

        Student s4=new Student(s1);
//        When we are creating s4 object of student class , we passed s1 object as arguement while creation of s4.


//        Primitive dataTypes are stored in stack memory.
//        Non-Primitive dataTypes are stored in heap with reference variable stored in stack memory.


//        Creating new class to show of passing one constructor in another

        class Stud{
            int roll;
            String Subj;
            float Marks;

// This is constructor passing one into another
//            The implicit return type of class constructor is the class type itself.
//            this will be replaced with name of name of class
            Stud(){
//                this is how you call constructor from another constructor
                this(2010991446,"DSA" , 87.8f);
            }
            Stud(int roll, String Subj, float Marks){
                this.roll=roll;
                this.Subj=Subj;
                this.Marks=Marks;
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println("object is destroyed");
            }
        }

        Stud S1=new Stud();
        Stud S2=S1;
        for(int i=0;i<10000000;i++){
            S1=new Stud();
        }
//        To check how garbage collector work , we used this loop.

//        If we are creating two objects . The both of them are pointing to same object.This will not create copy of that S1 . This will point to that object as it stores reference variable to that object .So if we make change through one of them both will be changed.

        System.out.println(S1.roll);
        System.out.println(S1.Subj);
        System.out.println(S1.Marks);

//        Wrapper Class: We can wrap primitive data type into wrapper class.
//        This is way of creating object of pirmitive data Type.
        Integer alpha =10;
        Integer beta=new Integer(20);

//        Final Keyword:: This keyword prevent content from being modified.
//        Final variable has to initialised while declaring , because we cannot add it , modify it or delete it.
//        The immutability of final variable that you cannot change is only for pirmitives.
//        In case of non pirmitive data Type , the reference to the object cannot be changed but the value of object can change.
//        When non-primitive is final, you cannot reassign it.

//        Ex :: Primitive
        final int bonus =2;
//        bonus=4;


//        Ex:: Non Primitive
         final class Stu{
             int num=10;
            final String name="Abhi";

         }
         Stu s5 =new Stu();
        System.out.println(s5.name);
//        s5.name="JAtt Saab";
//        This is giving error as assigned final directly to object.
//        If final is assigned directly to Non primitive too ... then cannot be changed too....speaially strings
        System.out.println(s5.name);
        s5.num=23;
//        We can change the value of objects inside final variable object or class.....
//        We cannot reassign reference of one object to another, but can change value of object.

//        Garbage Collector:: We cannot ask java to use garbage collector as it uses own its own , when it feels memory is full.
//        but we can ask to print something or do some specific actions while destroying garbage or using garbage collector.
//        Ex on line 144,145,146




    }
}
