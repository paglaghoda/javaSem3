public class overrideBhai {
    public static void main(String[] args) {
        Dogesh bhuru = new Doggy();
        bhuru.bark();
        bhuru.meow();
        bhuru.meowBhai();
        // bhuru.meowBhaw(); //This doesn't work as bhuru object only inherits properties and 
        // methods from Dogesh
    }
    
}

class Dogesh{
    public String dogName="Bhuri";
    void bark(){}
    void meow(){}
    void meowBhai(){
        System.out.println("meowBhai1");
    }
}

class Doggy extends Dogesh{
    @Override void bark(){
        System.out.println("Bhuru bhaw bhaw...meow");
    }
    @Override void meow(){
        System.out.println("Bhuru meow meowww...");
    }
    void meowBhaw(){
        System.out.println("meowBhaw2");
    }
}