import java.lang.Math.*;
public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusInKm = 6378;
        double radiusInMiles = radiusInKm * 0.621371; // Conversion in miles -> 1 km = 0.621371 miles
        
        double volumeInCubicKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);
        double volumeInCubicMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKm + " and cubic miles is " + volumeInCubicMiles);
    }
}