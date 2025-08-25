package Module3;

public class multiplecatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,4};
            System.out.println(arr[3]);
            // arr[3]= new String("Hi"); //Error

        } catch (ArithmeticException e) {
            System.out.println("Damn Arith Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of Index");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong data type of assignment");
        } finally {
            System.out.println("Handled");
        }
    }
}
