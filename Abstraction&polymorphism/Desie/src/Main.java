public class Main{
    public static void main(String[]args){
        ParentClass C1=new childClass1("Paracetamol",2,"Advil");
        C1.Showdetails();
        System.out.println("--------*****------");
ParentClass C2=new childClass2("Paracetamol",2,25);
C2.Showdetails();
System.out.println("-------*****---------");
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.identifyObjectType(C1);
        typeChecker.identifyObjectType(C2);
    }
}