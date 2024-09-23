public class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    static{
        name="Smartphones";
        System.out.println(name);
    }

    public Mobile(String brand, int price,String network){
        this.brand=brand;
        this.price=price;
        this.network=network;
    }

    public void show(){
        System.out.println(brand+" "+price+" "+network);
    }

    public static void show1(Mobile obj2){
        System.out.println(obj2.brand+" "+obj2.price+" "+obj2.network);
    }


}


