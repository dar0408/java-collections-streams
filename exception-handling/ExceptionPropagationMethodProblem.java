public class ExceptionPropagationMethodProblem {
    // Method that throws an ArithmeticException
    public static void method1(){
        int result = 10 / 0;
    }

    // Method that calls method1()
    public static void method2(){
        method1();
    }
    public static void main(String[] args) {
        try{
            // Call method2(), which propagates the exception
            method2();
        }
        catch(ArithmeticException e){
            // Handle exception in main()
            System.out.println("Exception handled in main");
        }
    }
}
