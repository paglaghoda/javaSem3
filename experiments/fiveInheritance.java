class VIT{
    public String name;
    VIT(String name){
        this.name=name;
    }
    void displayName(){
        System.out.println(this.name);
    }
}

class VITB extends VIT{
    VITB(String name){
        super(name);
    }
    void displayName(){
        System.out.println("VIT Bhopal");
    }
}

public class fiveInheritance {
    public static void main(String[] args) {
        VITB newVIT = new VITB("VIT Quality");
        newVIT.displayName();
    }
}
