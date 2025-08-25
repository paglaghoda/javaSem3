public class superKW {
    public static void main(String[] args) {
        newStudent newOne = new newStudent();
        newOne.displayDetail();
        newOne.displayNewDetail();
    }
    
}

class Student{
    //Data Members or Fields
    public String stuName="Omkar";
    public int age;

    Student(int age){
        this.age=age;
        System.out.println("Student constructor called");
    }

    public void displayDetail(){
        System.out.println(stuName);
    }
}

class newStudent extends Student {
    String stuName = "Bhuru";

    newStudent(){
        super(age);
        System.out.println("newStudent called");
    }

    void displayNewDetail(){
        System.out.println(super.stuName);
        System.out.println(stuName);
    }
}