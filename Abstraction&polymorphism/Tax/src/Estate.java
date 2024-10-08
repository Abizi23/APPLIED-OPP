public class Estate extends Vehicle {

    public Estate(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
        super(vehicleType, cif, age, seatingCapacity, grossWeight, engineCapacity, isDPS, bondDays, deliveredOnCarrier);
    }

    public double calculateTaxes() {
        double totalTax = 0;


        totalTax += 0.25*getCif();
        totalTax += 0.18*getCif();
        totalTax += 0.06*getCif();
        totalTax += IL_FLAT;
        totalTax += SD_FLAT;
        totalTax += FF_FLAT;
        totalTax += ED_FLAT;


        if (isDPS()) {
            totalTax += DPS_FEE;
        } else {
            totalTax += APS_FEE;
        }


        if (getSeatingCapacity() > 5) {
            totalTax += (getSeatingCapacity() - 5) * 250000;
        }


        if (getGrossWeight() > 2000) {
            totalTax += getCif() * 0.10;
        } else if (getGrossWeight() >= 1500) {
            totalTax += getCif() * 0.05;
        } else {
            totalTax += getCif() * 0.02;
        }


        if (getEngineCapacity() > 1800) {
            totalTax += getCif() * 0.05;
        } else {
            totalTax += getCif() * 0.025;
        }


        if (getAge() > 10) {
            totalTax += getCif() * 0.15;
        } else if (getAge() >= 5) {
            totalTax += getCif() * 0.05;
        } else if (getAge() >= 1) {
            totalTax += getCif() * 0.01;
        }

        return totalTax;
    }
}
