public class childClass1 extends ParentClass{
    String brandname;
    public childClass1(String drug, int dose,String brandname) {
        super(drug, dose);
        this.brandname=brandname;
    }

    @Override
    public void Showdetails() {
        super.Showdetails();
        System.out.println("Brandname is:"+brandname);
    }
}
