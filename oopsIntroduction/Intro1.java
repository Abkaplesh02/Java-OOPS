package oopsIntroduction;

public class Intro1 {
    public static void main(String[] args){
//        store 5 roll nos
        int rollNo[] = new int[5];
//        store 5 names
        String str[]=new String[5];
//        data of 5 students: {roll no, name , marks}
        int roll[]=new int[5];
        String name[]=new String[5];
        float marks[]=new float[5];

//        Class: A class is a named group of properties or functions.
//        Class is used to create our own datatype.
//        create a class
//        class is like a template
//        A class is a template for an object

//        An object is an instance of a class means physical stuff of that class.

//        A class is an logical construct.It does not exist physically.

//        An object is physical reality. This is the thing which is occupying space in the memory.

//        A class is used to create datatype that can be used to create objects.

//        When you declare an object of class , you are creating instance of class.

//        Objects are categorised into 3 major properties:
//        1.State of object[Value from dataType]
//        2.Indentity of object[Where is stored]
//        The identity of an object distinguish one object from another.This is useful to think of an object's identity as the place where it's values is stored in memory.
//        3.Behaviour of object[Effect of dataType operation]

//        Objects are stored in heap memory
//        Reference variables are stored in stack memory.

//         If dataType starts with capital letter , it is class in itself. ex : String.

//        Instance Variable: Variables that are declared inside the class.
//        ex: rolll and markss in student class.

//        This is dataType for every single student
//        create class
        class Student{
            int rolll;
            String namee;
            float markss;

//            We need a way to add the values of the above
//            properties object by object

//            We need one word to acess every obect
            Student(){
                this.namee="Abhishek Kaplesh";
                this.markss=98.5f;
                this.rolll=24;
            }

        }

        Student Abhishek=new Student();
        System.out.println(Abhishek.namee);
        System.out.println(Abhishek.markss);
        Abhishek.namee="Abhishek Kaplesh";
        Abhishek.markss=90.5f;
        Abhishek.rolll=32;
        System.out.println(Abhishek );
        System.out.println(Abhishek);
        System.out.println(Abhishek.rolll);
        System.out.println(Abhishek.markss);
        System.out.println(Abhishek.namee);

//        Abhishek is reference variable here
//        In Java, a reference variable is a variable that holds the memory address of an object
//        rather than the actual object itself.

//        . Dot links the reference variable of the object with the
//        instance variable of the class.
//        They are used to acess instance variable.

//        Student stud1:  This is declaring reference variable to object of Student class.This is not creating of an object. This is just reference to object of type student.This time the reference variable does not point to any object. It is just in stack memory.Untill it is assigned any object it stores null value in it.

//        Dynamic Memory allocation:: When memory is allocated durign runtime
//           Student student1=new Student();
//        New Operator::This dynamically allocates the memory at runtime and returns a reference to it which is stored in reference variable.

//A constructor defines what happens when your object will be created.


    }
}
