public class dictators {
    public String name;
    public String country;

    public dictators(String name, String country){
        this.name=name;
        this.country=country;

    }
    public void bio(){
        System.out.println(name+" ,"+country);
    }

    public void regimeruler(){
        System.out.println(name+" "+"is governing the country");
    }

    public void showdetails(){
        System.out.println("The details found here are confidential");
    }

    public void showdetails(String info){
        System.out.println("Dictator "+" "+name+" "+"of"+" "+country+" "+"is known for:"+info);
    }

}
