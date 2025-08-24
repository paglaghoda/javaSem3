public class MethodSingleOL {
    void printingSomething(int a){
        System.out.println("We're printing an Integer: "+a);
    }

    void printingSomething(String a){
        System.out.println("We're printing a String: "+a);
    }

    public static void main(String[] args) {
        MethodSingleOL newOne = new MethodSingleOL();
        newOne.printingSomething(10);
        newOne.printingSomething("Omkar");
    }

}
