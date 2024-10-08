public class Type3 implements ObjectBehaviour {

    int attribute=300;
    String Detail="Type 3 was built by the Americans";



    @Override
    public void performAction() {
        System.out.println("Type3:The machine is on action");
    }

    @Override
    public void haltAction() {
        System.out.println("Type3:The machine has stopped");

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
        if (attribute == 300) {
            return "Type3";
        }
        return null;
    }


    public void infoType1(){
        System.out.println("The model is 2000");
    }
}
