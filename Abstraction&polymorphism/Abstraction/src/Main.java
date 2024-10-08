public class Main{
    public static void main(String[]args){
Smartphone S=new Samsung("Samsung",0.15f,"4G",15000,"fifth",4500);
        System.out.println("The price for the samsung after tax is:"+" "+S.CalculatePriceAftertax(15000));
S.info();
System.out.println("-----------------******----------");
Smartphone A=new Apple("apple",0.18f,"5G",9,200000,"omega");
A.info();
System.out.println("The price for APPLE after tax:"+" "+A.CalculatePriceAftertax(200000));

    }
}