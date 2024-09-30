public class Main {
    public static void main(String[]args){
       patient R=new patient("Femke Bol",23,"Hague");
        System.out.println("The patient name is:"+R.getName());
        System.out.println( R.Cost(98,2,1));

        System.out.println("------------*********-------");
       Lab L=new Lab("Femke Bol",23,"Hague","LFT",55);
        L.greet();


        L.showinfo();


       L.Cost();
       System.out.println("-------------************--------------");
       doctor D=new doctor("Femke Bol",23,"Hague","Lipogram",94,"Adam","hyperchlosterimia","statin");
       D.greet();
       D.PatientAssesemnet();
        System.out.println("-------------************--------------");
       pharmacy p=new pharmacy("Femke Bol",23,"Hague","Lipogram",54,"Adam","Statin",63,3,"hypercholesterol");
       p.greet();
       p.PatientAssesemnet();



    }

}
