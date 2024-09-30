public class TotalitarianDictator extends dictators{
    boolean controlsMedia;

    public TotalitarianDictator(String name,String country,boolean controlsMedia){
        super(name,country);
        this.controlsMedia=controlsMedia;
    }

    public void regimerule(){
        System.out.println(name+" "+"rules"+" "+country+" "+"with total control,including media:"+(controlsMedia?"yes":"No"));
    }
       
       
    
}
