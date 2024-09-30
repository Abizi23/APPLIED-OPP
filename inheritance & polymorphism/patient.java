import javax.naming.Name;


public class patient{
    private String name;
    private int age;
    private String Address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public patient(String name, int age, String Address){
        this.name=name;
        this.age=age;
        this.Address=Address;


        }
        public void showinfo(){
            System.out.println("Name: " + name + ", Age: " + age+" "+"Address:"+Address);
        }



    public int Cost(int price,int discount){
        return price-discount;
    }
    public int Cost(int price,int discount,int coupon){
        System.out.println("The consultation fee is:");
        return price-(discount+coupon);
    }
}