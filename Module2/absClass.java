public class absClass {
    public static void main(String[] args) {
        Student s1 = new stu();
        s1.getBhuru();
    }
}

abstract class Student{
    public String name="bhuri";
    abstract void getBhuru();
}

class stu extends Student{
    void getBhuru(){
        System.out.println("Bhuru says meow");
    }
}