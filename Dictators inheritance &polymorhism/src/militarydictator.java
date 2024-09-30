public class militarydictator extends dictators{

    private String militaryRank;

    public militarydictator(String name,String country,String militaryRank){
         super(name,country);
         this.militaryRank=militaryRank;



    }
    public void regimerule(){
        System.out.println(name+" "+"rules"+" "+country+" "+"with military force as a"+" "+militaryRank);
    }


}