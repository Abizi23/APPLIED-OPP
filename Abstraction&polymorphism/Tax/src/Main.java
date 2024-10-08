import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();


        vehicles.add(new Ambulance("Ambulance", 20000, 5, 4, 1800, 2000, true, 15, true));
        vehicles.add(new Estate("Estate", 15000, 6, 7, 1600, 1800, false, 10, false));
        vehicles.add(new Sedan("Sedan", 10000, 8, 5, 1400, 1600, true, 20, true));
        vehicles.add(new SUV("SUV", 25000, 3, 6, 4800, 2200, false, 5, true));
        vehicles.add(new Trailer("Trailer", 50000, 12, 2, 18000, 17000, false, 30, false));
        vehicles.add(new othercars("Other", 12000, 4, 4, 1600, 1500, true, 20, true));


        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getVehicleType());
            System.out.println("CIF: " + vehicle.getCif());
            System.out.println("Age: " + vehicle.getAge());
            System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
            System.out.println("Gross Weight: " + vehicle.getGrossWeight());
            System.out.println("Engine Capacity: " + vehicle.getEngineCapacity() );


            double totalTaxes = vehicle.calculateTaxes();
            System.out.println("Total Taxes: UGX " + totalTaxes);


            System.out.println("Bond Fees: UGX " + vehicle.calculateBondFee());
            System.out.println("Transportation Fee: UGX " + vehicle.calculateTransportationFee());
        }
    }
}
