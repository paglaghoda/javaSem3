public class Pyramid {
    public static void main(String[] args) {
        // int count=1;
        int n = 5; // Number of rows
        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int col = 1; col<=5-row; col++) {
                System.out.print(" ");
            }
            // Print stars
            for (int col=1; col<row; col++){
                System.out.print(col); 
            }
            
            for (int col=row; col>=1; col--){
                System.out.print(col); 
            }

            System.out.println();
            }
            // New line after each row
        }

        // int n = 4; // Number of rows
        // int num = 1; // Starting number
        // for (int i = 1; i <= n; i++) {
        //     // Print spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print numbers
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     // New line
        //     System.out.println();
        // }
    }