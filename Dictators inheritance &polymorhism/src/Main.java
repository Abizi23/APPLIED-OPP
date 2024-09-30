public class Main{
    public static void main(String[]args){
        militarydictator M=new militarydictator("Ali Bongo","Gutykia", "colonel");
        TotalitarianDictator T=new TotalitarianDictator("Jose Gom","Nokacua", true);

        M.regimerule();
        T.regimerule();

        M.showdetails();
        M.showdetails("Cruelty");

    }
}