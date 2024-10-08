public class Vehicle {
    private String vehicleType;
    private double cif;
    private int age;
    private int seatingCapacity;
    private double grossWeight;
    private int engineCapacity;
    private boolean isDPS;
    private double bondDays;
    private boolean deliveredOnCarrier;


    static final double ID_RATE = 0.25;
    static final double VAT_RATE = 0.18;
    static final double WHT_RATE = 0.06;
    static final double IL_FLAT = 150000;
    static final double SD_FLAT = 35000;
    static final double FF_FLAT = 20000;
    static final double ED_FLAT = 200000;
    static final double APS_FEE = 300000;
    static final double DPS_FEE = 700000;

    public String getVehicleType() {
        return vehicleType;
    }

    public double getCif() {
        return cif;
    }

    public int getAge() {
        return age;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isDPS() {
        return isDPS;
    }

    public double getBondDays() {
        return bondDays;
    }

    public boolean isDeliveredOnCarrier() {
        return deliveredOnCarrier;
    }

    public double calculateTaxes() {
        return 0;
    }


    public Vehicle(String vehicleType, double cif, int age, int seatingCapacity, double grossWeight, int engineCapacity, boolean isDPS, double bondDays, boolean deliveredOnCarrier) {
        this.vehicleType = vehicleType;
        this.cif = cif;
        this.age = age;
        this.seatingCapacity = seatingCapacity;
        this.grossWeight = grossWeight;
        this.engineCapacity = engineCapacity;
        this.isDPS = isDPS;
        this.bondDays = bondDays;
        this.deliveredOnCarrier = deliveredOnCarrier;
    }



    public double calculateBondFee() {
        return bondDays * 15000;
    }


    public double calculateTransportationFee() {
        if (deliveredOnCarrier) {
            return cif * 0.005;
        } else {
            return cif * 0.015;
        }
    }

}