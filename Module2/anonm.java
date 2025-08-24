public class anonm {
    public static void main(String[] args) {
        HelloWorld newHello = new HelloWorld() {
            @Override
            public void printMe(){
                System.out.println("Value Changed by Bhuru! :)");
            }};
        newHello.printMe();
    }
}

interface HelloWorld{
    void printMe();
}