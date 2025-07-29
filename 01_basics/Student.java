public class Student {

    public String studentName;
    public int rollNumber;
    public char stuGrade;

    public void displayStuDetails(String name, int roll, char grade){
        this.studentName=name;
        this.rollNumber=roll;
        this.stuGrade=grade;

        System.out.println("Student's name: " + name);
        System.out.println("Student's roll: " + roll);
        System.out.println("Student's grade: " + grade);
    }

    public Student(){
        this.studentName="Omkar";
        this.rollNumber=26;
        this.stuGrade='A';

        System.out.println("Default Constructor called");

    }

    public Student(String sname, int rolln, char sgrade){
        this.studentName=sname;
        this.rollNumber=rolln;
        this.stuGrade=sgrade;

        System.out.println("Parameterized Constructor called");
    }


    public static void main(String args[]){

        //Creating an object in Student class

        //Default
        Student stu1 = new Student();
        stu1.displayStuDetails(stu1.studentName, stu1.rollNumber, stu1.stuGrade);
        //Parameterized
        Student stu2 = new Student("Omkara",19,'A');
        stu2.displayStuDetails(stu2.studentName, stu2.rollNumber, stu2.stuGrade);
    }

}
