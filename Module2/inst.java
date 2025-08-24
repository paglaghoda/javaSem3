public class inst {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1 instanceof Student);
        //OP:
        //Meow
        //true
    }
}

class Student{
    Student(){
        System.out.println("Meow");
    }
}
