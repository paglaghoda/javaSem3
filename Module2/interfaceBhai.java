public class interfaceBhai {
    public static void main(String[] args) {
        imp newOne = new imp();
        newOne.printMe();
        newOne.bbgHehe();
    }
}

interface inter1{
    final int myVal1=10;
    void printMe();
    void bbgHehe();
}

interface inter2{
    final int myVal2=20;
    void printMe();
    void bbgHehe();
}

class imp implements inter1,inter2{
    public void printMe(){
        System.out.println("Meow meow");
    }
    public void bbgHehe(){
        System.out.println("Bhaw Bhaw");
    }
}