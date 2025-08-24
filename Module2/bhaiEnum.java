public class bhaiEnum {
    public static void main(String[] args) {
        Cars car1 = Cars.Maruti;
        System.out.println(car1+" "+car1.getModelName());

    }
    
}

enum Cars {
    Maruti("Alto"), Mahindra("Scorpio"), Tata("Nano");

    private String model;

    Cars(String model){
        this.model=model;
    }

    public String getModelName(){
        return model;
    }
}