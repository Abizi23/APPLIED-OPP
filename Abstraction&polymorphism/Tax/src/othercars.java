public class othercars extends Vehicle{


        public othercars(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
            super(vehicleType, cif, age, seatingCapacity, grossWeight, engineCapacity, isDPS, bondDays, deliveredOnCarrier);
        }


        public double calculateTaxes() {
            double tTax = 0;


            tTax += ID_RATE * getCif();
            tTax += VAT_RATE * getCif();
            tTax += WHT_RATE * getCif();
            tTax += IL_FLAT;


            tTax += SD_FLAT;
            tTax += FF_FLAT;
            tTax += ED_FLAT;


            tTax += calculateTransportationFee();


            tTax += calculateBondFee();

            return tTax;
        }


    }



