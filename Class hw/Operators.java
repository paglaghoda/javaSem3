public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Arithmetic: +,-,*,/,%: " + (a + b) + ", " + (a - b) + ", " + (a * b) + ", " + (a / b) + ", " + (a % b));
        System.out.println("Relational: <,>,<=,>=,==,!=: " + (a < b) + ", " + (a > b) + ", " + (a <= b) + ", " + (a >= b) + ", " + (a == b) + ", " + (a != b));
        System.out.println("Logical: &&,||,!: " + (a > b && b > 0) + ", " + (a > b || b > 0) + ", " + !(a > b));
        System.out.println("Bitwise: &,|,^,~,<<,>>: " + (a & b) + ", " + (a | b) + ", " + (a ^ b) + ", " + (~a) + ", " + (a << 1) + ", " + (a >> 1));
        System.out.println("Assignment: =,+=,-=,*=,/=,%=: " + (a += b) + ", " + (a -= b) + ", " + (a *= b) + ", " + (a /= b) + ", " + (a %= b));
        System.out.println("Ternary: ? : " + (a > b ? a : b));
        System.out.println("Unary: ++,--,+,-: " + (++a) + ", " + (--b) + ", " + (+a) + ", " + (-b));
    }
}