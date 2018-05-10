/**
 * Created by MDavidovich on 7/5/16.
 */
public class Davidovich_A02Q6 {

    // This program creates a diamond using the "*" character.  It was made to demonstrate
    // understanding of nested for loops.

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {                    // First for loops create top
            for (int space = 1; space <= 5 - row; space++)      // half of diamond.
                System.out.print(" ");
                for (int star = 1; star <= (row * 2) - 1; star += 1)
                    System.out.print("*");

            System.out.println();

        }
        for (int row = 5; row >= 1; row--) {                    // Second for loops create bottom
            for (int space = 1; space <= 5 - row; space++)      // half of diamond.  
                System.out.print(" ");
                for (int star = 1; star <= (row * 2) - 1; star += 1)
                    System.out.print("*");

            System.out.println();
        }
    }
}