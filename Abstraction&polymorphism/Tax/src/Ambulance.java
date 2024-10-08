public class Ambulance extends Vehicle {

    public Ambulance(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
        super(vehicleType, cif, age, seatingCapacity, grossWeight, engineCapacity, isDPS, bondDays, deliveredOnCarrier);
    }

    public double calculateTaxes() {
        double tTax = 0;
        tTax += SD_FLAT;
        tTax += FF_FLAT;
        tTax += ED_FLAT;
        tTax += DPS_FEE;


        calculateAgeTax(tTax);
        return tTax;
    }


    private void calculateAgeTax(double tTax) {
        if (getAge() > 10) {
            tTax += getCif() * 0.15;
        } else {
            tTax += IL_FLAT;
        }
    }
}
