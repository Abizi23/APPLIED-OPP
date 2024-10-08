public class ParentClass {
    private String drug;
    private int dose;

    public ParentClass(String drug, int dose) {
        this.drug = drug;
        this.dose = dose;
    }

    public String getDrug() {
        return drug;
    }

    public int getDose() {
        return dose;
    }

    public void Showdetails(){
        System.out.println("The Medication is :"+" "+drug);
        System.out.println("The dose is:"+" "+dose);
    }
    public final void displayMessage() {
        System.out.println("It cannot be overridden");
    }
}
