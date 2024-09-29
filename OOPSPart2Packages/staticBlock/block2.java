package OOPSPart2Packages.staticBlock;

public class block2 {
     static class test{
        String name;

        public test(String name){
            this.name=name;
        }
    }

//    Here the test does not have any instance of it's outer class block2 neither does main have any instance of block2.
//    But main and test can have instance of each other as both are static.

    public static void main(String[] args) {
        test a=new test("Abhishek");
        test b=new test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
