public class Type2 implements ObjectBehaviour {

    int attribute=200;
    String Detail="Type 2 was built by Chinese";



    @Override
    public void performAction() {
        System.out.println("Type2:The machine is on action");
    }

    @Override
    public void haltAction() {
        System.out.println("Type2:The machine has stopped");

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
        if (attribute == 200) {
            return "Type2";
        }
        return null;
    }


    public void infoType1(){
        System.out.println("The model is 1900");
    }
}
