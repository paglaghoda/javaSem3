package Module3;

public class trycatch {

    public static void main(String[] args) {
        int a=10;
        int b=2;

        try{
            int result = a/b;
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.err.println("Division by Zero Not Allowed");
        } finally {
            System.out.println("Handled");
        }
    }
    
}

