package Module3;

public class nestedTry {
    public static void main(String[] args) {
        try{
            int[] arr={3,4,6};
            int a=10;
            int b=5;
            try{
                arr[1]=a/b;
            } catch(ArithmeticException e) {
                System.err.println("Division by zero not possible");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Out of Bounds");
        } finally {
            System.out.println("Handled");
        }
    }
}
