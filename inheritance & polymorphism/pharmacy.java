public class pharmacy extends doctor {

    private int price;
    private int dose;

    public pharmacy(String name, int age, String Address, String Testname, int price, String doctorName, String medication, int price1, int dose,String assesement) {
        super(name, age, Address, Testname, price, doctorName, medication,assesement);
        this.price = price1;
        this.dose = dose;
    }
    public void greet(){
        System.out.println("WELCOME TO PHARMACY");
    }


    public int getcost(){
        return price;
    }
    public int getDose(){
        return dose;
    }

    public void PatientAssesemnet(){
        super.PatientAssesemnet();
        System.out.println("\n "+"The price for the medication is:"+" "+getcost()+"\n "+"Dose ordered:"+"  "+getDose()+" "+"per day for 7 days"+" \n");
    }

}
