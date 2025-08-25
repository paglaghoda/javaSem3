package Module3;

public class throwsTest {

    static void agecheck(int a) throws ArithmeticException, NullPointerException{
        if (a<18){
            throw new ArithmeticException("You're not Eligible for Voting");
        } else {
            System.out.println("Har har Modi, Ghar ghar Modi, Kaan kholkar sunoo Verodhi");
        }
    }
    public static void main(String[] args) {
        try {
            int a=15;
            agecheck(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
