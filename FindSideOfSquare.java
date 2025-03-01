import java.util.Scanner;

public class FindSideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        double sideOfSquare = perimeter / 4;
        
        System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);
    }
}
