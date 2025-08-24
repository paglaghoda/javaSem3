public class threeStaticOL {
    //Static Overloading

    static int addition(int a, int b){
        return a+b;
    }

    static double addition(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(addition(10,20));
        System.out.println(addition(10.5,20.9));
    }
}
