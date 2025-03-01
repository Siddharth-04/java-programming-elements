import java.util.Scanner;

public class FindAreaOfTraingleInInchesandCmSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in centimeter : ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in centimeter : ");
        double height = input.nextDouble();
        
        double areaInCentimeterSquare = 0.5 * base * height;
        double areaInInchesSquare = areaInCentimeterSquare / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq cm is " + areaInCentimeterSquare + " and in sq in is " + areaInInchesSquare);
    }
}
