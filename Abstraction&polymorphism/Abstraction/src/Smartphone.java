public abstract class Smartphone {
    private String name;
    private float tax;
    private String network;

    public Smartphone(String name, float tax, String network) {
        this.name = name;
        this.tax = tax;
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public float getTax() {
        return tax;
    }

    public String getNetwork() {
        return network;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public abstract void info();

    public float CalculatePriceAftertax(float price){
        float priceaftertax=0;
        return (price+(price*tax));
    }
}
