package Module3;

public class customEx {
    static void ageCheck(int age) throws votingEligibility {
        if (age<18){
            throw new votingEligibility("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            int age=17;
            ageCheck(age);
        } catch (votingEligibility e) {
            System.out.println(e.getMessage());
        }
    }
    
}

class votingEligibility extends Exception{
    public votingEligibility(){
        super();
    }
    public votingEligibility(String str){
        super(str);
    }
}