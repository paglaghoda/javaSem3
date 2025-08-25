package Module1;

import java.util.Scanner;

public class inputPractice {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        scanner.close();

        if(age>18){
            System.out.println("Hi "+name);
        } else {
            System.out.println("Meow meow");
        }
    }
}
