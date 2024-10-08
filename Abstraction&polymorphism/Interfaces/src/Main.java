import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Type1 T1 = new Type1();
      T1.getDetail();
      Type2 T2 = new Type2();
      T2.getDetail();
      Type3 T3 = new Type3();
      T3.getDetail();


        List<ObjectBehaviour> objects = new ArrayList<>();
        objects.add(new Type1());
        objects.add(new Type2());
        objects.add(new Type3());

        for (ObjectBehaviour obj : objects) {
            obj.performAction();
            obj.haltAction();


            System.out.println("Attribute: " + obj.getAttribute());
            System.out.println("Type: " + obj.getType());

        }
    }
}