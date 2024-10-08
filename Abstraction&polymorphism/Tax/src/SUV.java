public class SUV extends Vehicle {

    public SUV(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
        super(vehicleType, cif, age, seatingCapacity, grossWeight, engineCapacity, isDPS, bondDays, deliveredOnCarrier);
    }


    public double calculateTaxes() {
        double totlTax = 0;


        totlTax += ID_RATE * getCif() + VAT_RATE * getCif() + WHT_RATE * getCif() + IL_FLAT + SD_FLAT + FF_FLAT + ED_FLAT;


        totlTax += APS_FEE;


        if (getSeatingCapacity() > 5) {
            totlTax += (getSeatingCapacity() - 5) * 350000;
        }


        if (getGrossWeight() > 5000) {
            totlTax += getCif() * 0.15;
        }


        if (getAge() > 10) {
            totlTax += getCif() * 0.25;
        } else if (getAge() >= 5) {
            totlTax += getCif() * 0.15;
        } else {
            totlTax += getCif() * 0.01;
        }
        if (isDPS()) {
            totlTax += DPS_FEE;
        } else {
            totlTax += APS_FEE;
        }


        return totlTax + calculateBondFee() + calculateTransportationFee();
    }
}
