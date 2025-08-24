public class singleton {
    public static void main(String[] args) {
        System.out.println(Single.getInst());
    }
}

class Single{

    //Initializing a pvt variable
    private static Single in1 = null;

    //Initializing a pvt constructor
    private Single(){}

    //Making a method to initialize an object
    public static Single getInst(){
        if (in1==null){
            in1=new Single();
        }
        return in1;
    }
}
