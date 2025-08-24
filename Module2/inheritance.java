public class inheritance {
    public static void main(String[] args) {
        Dog dawg = new Dog();
        dawg.getDogName();
        Bhuru bhaw = new Bhuru();
        bhaw.getDogName();
        bhaw.getBhuruName();

    }
    
}

class Dog{
    public static String dogName = "Dogesh Bhai";

    void getDogName(){
        System.out.println("Dogesh Bhai....");
    }
}

class Bhuru extends Dog{
    void getBhuruName(){
        System.out.println("Bhuru Bhai...");
    }
}

