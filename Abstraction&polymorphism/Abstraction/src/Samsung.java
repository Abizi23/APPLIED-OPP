public class Samsung extends Smartphone {
    private float price;
    private String generation;
    private int batterycapacity;

    public Samsung(String name, float tax, String network, float price, String generation, int batterycapacity) {
        super(name, tax, network);
        this.price = price;
        this.generation = generation;
        this.batterycapacity = batterycapacity;
    }

    public float getPrice() {
        return price;
    }

    public String getGeneration() {
        return generation;
    }

    public int getBatterycapacity() {
        return batterycapacity;
    }

    @Override
    public void info() {
        System.out.println("The mobile name:"+getName());
        System.out.println("The network:"+" "+getNetwork());
        System.out.println("The price before tax:"+" "+getPrice());
        System.out.println("The price for Samsung phone before tax:"+" "+getPrice());
        System.out.println("The genertaion of the Samsung phone is:"+" "+getGeneration());
        System.out.println("The battery capacity of the Samsung phone is:"+getBatterycapacity());
    }
}
