public class cons {
    public static void main(String[] args) {
        Student s1 = new Student(5);
        System.out.println(s1.age);
    }
}

class Student{
    int age;
    Student(){ //No-Args
        System.out.println("No-Args Cons");
    }

    Student(int age){ //Parameterized
        this.age=age;
    }
}

//Types of Cons: Default, Paramterized, No-Args


