package lab8;

public class Main {
    public static void main(String[] args) /*throws Exception*/ {
//        MyClass myClass = new MyClass(1);

        try {
            MyClass myClass = new MyClass(1);
            myClass.myMethod();
        } catch (NotPositibeFieldException e) {
//            e.printStackTrace();
            System.out.println("Please use positive values:)");
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("Please use positive values:)");
        }


//        System.err.println(":P");
        /*try {
//            ... work
//            throw new Exception();
            throw new Error();
//            ... not work
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println("Done!");
    }
}
