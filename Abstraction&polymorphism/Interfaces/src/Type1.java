public class Type1 implements ObjectBehaviour {

int attribute=100;
String Detail="Type 1 was built by Romans";



    @Override
    public void performAction() {
        System.out.println("Type1:The machine is on action");
    }

    @Override
    public void haltAction() {
        System.out.println("Type1:The machine has stopped");

    }
    public void getDetail(){
        System.out.println(Detail);
    }

    @Override
    public int getAttribute() {

        return attribute;

    }

    @Override
    public String getType() {
        if (attribute == 100) {
            return "Type1";
        }
        return null;
    }


    public void infoType1(){
        System.out.println("The model is 1889");
    }
}
