//import java.util.Scanner;
//
//public class Demo {
//    Scanner scanner = new Scanner(System.in);
//    String name1= "Demo";
//    void display() {
//
//
//        System.out.println("Demo");
//    }
//
//    String name() {
//
//        String fName = "Demo   Example";
//        System.out.println("Name");
//        return fName;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        String name = "Demo";
////        System.out.println(name);
////        System.out.println("Enter your name ");
////        name = scanner.next();
////        System.out.println(name);
//
//        Demo obj = new Demo();
//        obj.display();
//        obj.name();
//        System.out.println(obj.name());
//        String fn = obj.name();
//        System.out.println("Basic");
//        System.out.println(fn);
//    }
//}
//
//
//
//

class  Example{
    void example(){
        System.out.println("Example example");
    }
}


class Basic extends  Example{

    @Override
    void example() {
        super.example();
    }

    void display(){
        System.out.println("Basic Display");
    }
}


public class Demo  extends Basic{

    @Override
    void example() {
        super.example();
    }

    @Override
    void display() {
        super.display();

        System.out.println("Demo Display");

    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.display();
        demo.example();

    }
}