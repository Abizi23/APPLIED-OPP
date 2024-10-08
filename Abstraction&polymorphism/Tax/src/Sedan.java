public class Sedan extends Vehicle {

    public Sedan(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
        super(vehicleType, cif, age, seatingCapacity, grossWeight, engineCapacity, isDPS, bondDays, deliveredOnCarrier);
    }


    public double calculateTaxes() {
        double totaTax = 0;


        totaTax += ID_RATE*getCif() + VAT_RATE*getCif() + WHT_RATE*getCif() + IL_FLAT + SD_FLAT + FF_FLAT + ED_FLAT;


        totaTax += DPS_FEE;

        if (getGrossWeight() > 2000) {
            totaTax += getCif() * 0.15;
        } else if (getGrossWeight() >= 1500) {
            totaTax += getCif() * 0.10;
        } else {
            totaTax += getCif() * 0.02;
        }


        if (getEngineCapacity() > 2000) {
            totaTax += getCif() * 0.10;
        } else if (getEngineCapacity() >= 1500) {
            totaTax += getCif() * 0.05;
        } else {
            totaTax += getCif() * 0.025;
        }



        if (getAge() >= 10) {
            totaTax += getCif() * 0.10;
        } else if (getAge()>= 5) {
            totaTax += getCif() * 0.05;
        } else {
            totaTax += getCif() * 0.015;
        }

        return totaTax + calculateBondFee() + calculateTransportationFee();
    }
}

