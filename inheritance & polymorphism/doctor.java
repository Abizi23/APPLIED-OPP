public class doctor extends Lab {
    private String doctorName;
    private String assesment;
    private String medication;


    public String getMedication() {
        return medication;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAssesemnt() {
        return assesment;
    }

    public doctor(String name, int age, String Address, String Testname, int price, String doctorName, String assesemnt,String medication){
        super(name,age,Address,Testname,price);
        this.doctorName=doctorName;
        this.assesment=assesemnt;
        this.medication=medication;
    }
    public void greet(){
        System.out.println("WELCOME TO PHYSCIAN");
    }

    public void PatientAssesemnet(){
        System.out.println("The patient name is:"+" "+getName()+"\n "+"Tests that has been done:"+" "+getTestname()+"\n "+"visited Doctor:"+" "+getDoctorName()+"\n "+"Has been diagnosed as:"+" "+getAssesemnt()+"\n"+"Medication ordered:"+" "+getMedication());
    }



}
