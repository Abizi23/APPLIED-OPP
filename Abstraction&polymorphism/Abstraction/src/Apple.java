import java.sql.SQLOutput;

public class Apple extends Smartphone {
    private int Version;
    private float price;
    private String Brandname;

    public Apple(String name, float tax, String network, int version, float Price, String brandname) {
        super(name, tax, network);
        Version = version;
        price = Price;
        Brandname = brandname;
    }

    public int getVersion() {
        return Version;
    }

    public float getPrice() {
        return price;
    }

    public String getBrandname() {
        return Brandname;
    }

    @Override
    public void info() {
        System.out.println("The name of the phone:"+" "+getName());
        System.out.println("The tax for an apple phone:"+" "+getTax());
        System.out.println("The network for an apple:"+" "+getNetwork());
        System.out.println("the Version for an apple:"+" "+getVersion());
        System.out.println("The price before tax for an apple:"+getPrice());
        System.out.println("The brand name :"+" "+getBrandname());
    }
}
