import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (one per line, empty line to stop):");
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) break;
            
            try {
                String numberStr = input.replaceAll("[^0-9-]", "");
                long number = Long.parseLong(numberStr);
                System.out.println(number + " can be fitted in:");
                
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                if (!(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) &&
                    !(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) &&
                    !(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) &&
                    !(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)) {
                    System.out.println(number + " can't be fitted anywhere.");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}