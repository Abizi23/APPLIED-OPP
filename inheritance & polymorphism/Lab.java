public class Lab extends patient{
    private String Testname;
    private int price;

    public Lab(String name, int age, String Address, String Testname, int price) {
        super(name, age, Address);
        this.Testname = Testname;
        this.price = price;
    }
    public void greet(){
        System.out.println("WELCOME TO LABORATORY");
    }
    public String getTestname(){
        return Testname;

    }
    public int getPrice(){
        return price;
    }
    public void showinfo(){
        super.showinfo();
        System.out.println("The Laboratory test is:"+Testname);
    }
    public void Cost(){
        System.out.println("Laboratory Bill is:"+" "+getPrice());
    }
}
