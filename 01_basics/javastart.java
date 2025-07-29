import java.util.Scanner;

public class javastart{

    public static void main(String args[]){
        System.out.println("Omkar accha baccha hai!");
        Scanner userInput = new Scanner(System.in);
    
        //Taking name
        System.out.println("What's your name bbg?  ");
        String userName = userInput.nextLine();
    
        //Taking age
        System.out.println("What's your age bbg? ");
        int userAge = userInput.nextInt();
        
        System.out.println(displayName(userName,userAge));

        userInput.close();
    }

    public static String displayName(String username, int userage){
        return """
                Hello %s, You are %d years old today! Congrats!
                """.formatted(username, userage);
    }

}