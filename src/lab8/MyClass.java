package lab8;

public class MyClass implements MyInterface {
    private int myPositiveField;

    public MyClass(int myPositiveField) throws Exception {
        if (myPositiveField <= 0) {
//            System.out.println("Err!");
//            throw new Exception("myPositiveField > 0 !!!");
            throw new NotPositibeFieldException("myPositiveField > 0 !!!");
//            throw new RuntimeException("myPositiveField > 0 !!!");
        } else {
            this.myPositiveField = myPositiveField;
        }
    }

    @Override
    public void myMethod() /*throws MyException*/ {
        System.out.println("In myMethod");
//        ...
        throw new MyRuntimeException();
//        ...
    }
}
