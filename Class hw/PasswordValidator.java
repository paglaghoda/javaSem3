import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter password: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) break;
            
            if (input.length() != 6) {
                System.out.println("INVALID: Password must be exactly 6 digits");
                continue;
            }
            
            boolean isNumeric = true;
            int sum = 0, evenCount = 0;
            boolean hasConsecutiveSame = false, isAlternating = true;
            int[] digits = new int[6];
            
            // Convert to digits and check if numeric
            for (int i = 0; i < 6; i++) {
                char c = input.charAt(i);
                if (!Character.isDigit(c)) {
                    isNumeric = false;
                    break;
                }
                digits[i] = c - '0';
                sum += digits[i];
                if (digits[i] % 2 == 0) evenCount++;
            }
            
            if (!isNumeric) {
                System.out.println("INVALID: Password must contain only digits");
                continue;
            }
            
            // Check consecutive digits
            for (int i = 0; i < 5; i++) {
                if (digits[i] == digits[i + 1]) {
                    hasConsecutiveSame = true;
                    break;
                }
            }
            
            // Check alternating pattern
            for (int i = 1; i < 5; i++) {
                if (!((digits[i] > digits[i-1] && digits[i] > digits[i+1]) || 
                      (digits[i] < digits[i-1] && digits[i] < digits[i+1]))) {
                    isAlternating = false;
                    break;
                }
            }
            
            // Validate all rules
            if (sum % 10 != 0) {
                System.out.println("INVALID: Sum not divisible by 10");
            } else if (evenCount < 2) {
                System.out.println("INVALID: Less than two even digits");
            } else if (hasConsecutiveSame) {
                System.out.println("INVALID: Repeated consecutive digits");
            } else if (!isAlternating) {
                System.out.println("INVALID: Digits do not alternate");
            } else {
                System.out.println("VALID");
            }
        }
        scanner.close();
    }
}