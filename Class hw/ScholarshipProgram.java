import java.util.Scanner;

public class ScholarshipProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total marks (out of 100): ");
        int marks = scanner.nextInt();
        System.out.print("Enter number of extracurricular activities: ");
        int activities = scanner.nextInt();
        
        String scholarship;
        int bonus;
        
        // Scholarship allocation based on marks
        if (marks >= 90) {
            scholarship = "Platinum Scholarship";
        } else if (marks >= 80) {
            scholarship = "Gold Scholarship";
        } else if (marks >= 70) {
            scholarship = "Silver Scholarship";
        } else if (marks >= 60) {
            scholarship = "Bronze Scholarship";
        } else {
            scholarship = "No Scholarship";
        }
        
        // Bonus allocation based on activities
        if (activities >= 5) {
            bonus = 5000;
        } else if (activities >= 3) {
            bonus = 3000;
        } else if (activities >= 1) {
            bonus = 1000;
        } else {
            bonus = 0;
        }
        
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Bonus: Rs" + bonus);
        scanner.close();
    }
}