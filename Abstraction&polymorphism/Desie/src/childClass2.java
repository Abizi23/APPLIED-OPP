public class childClass2 extends ParentClass{
    int Price;

    public childClass2(String drug, int dose, int price) {
        super(drug, dose);
        Price = price;
    }

    @Override
    public void Showdetails() {
        super.Showdetails();
        System.out.println("The price for the medication is:"+" "+Price);
    }
}
