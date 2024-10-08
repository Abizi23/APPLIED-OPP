public class Trailer extends Vehicle {

    public Trailer(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
        super(vehicleType, cif, age, seatingCapacity, grossWeight, engineCapacity, isDPS, bondDays, deliveredOnCarrier);
    }


    public double calculateTaxes() {
        double totTax = 0;

        totTax += ID_RATE*getCif() + VAT_RATE*getCif() + WHT_RATE*getCif() + IL_FLAT + SD_FLAT + FF_FLAT + ED_FLAT;


        if(isDPS()){
            totTax+=DPS_FEE;
        }else{
            totTax+=APS_FEE;

        }



        if (getGrossWeight() > 20000) {
            totTax += getCif() * 0.25;
        } else if (getGrossWeight() >= 15000) {
            totTax += getCif() * 0.15;
        } else {
            totTax += getCif() * 0.05;
        }


        if (getEngineCapacity() > 20000) {
            totTax += getCif() * 0.10;
        } else if (getEngineCapacity() >= 15000) {
            totTax += getCif() * 0.05;
        } else {
            totTax += getCif()*0.025;
        }


         if (getAge() >= 10) {
            totTax += getCif()* 0.10;
        } else if (getAge() >= 5) {
            totTax += getCif() * 0.05;
        } else {
            totTax += getCif() * 0.015;
        }

        return totTax + calculateBondFee() + calculateTransportationFee();
    }
}
