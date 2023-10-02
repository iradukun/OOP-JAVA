import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the Christmas tree: ");
        int length = input.nextInt();

        for (int i = 1; i <= length; i++) {
            // Print spaces
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print the tree trunk
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < length - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        input.close();
    }
}
