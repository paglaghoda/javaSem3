class VIT{
    public String campusName;

    VIT(String name){
        this.campusName=name;
    }

    void displayName(){
        System.out.println(this.campusName);
    }
}

public class twoClass {
    public static void main(String[] args) {
        VIT vitb = new VIT("VIT Bhopal");
        vitb.displayName();
        System.out.println("Hi Omkar!");
    }
}

