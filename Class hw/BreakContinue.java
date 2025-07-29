public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break; // Exits loop when i is 5
            System.out.print(i + " ");
        }
        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue; // Skips iteration when i is 5
            System.out.print(i + " ");
        }
    }
}