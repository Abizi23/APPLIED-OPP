public class TypeChecker  {



    public void identifyObjectType(ParentClass obj) {
            if (obj instanceof childClass1) {
                System.out.println("The object is an instance of ChildClass1.");
            } else if (obj instanceof childClass2) {
                System.out.println("The object is an instance of ChildClass2.");
            } else {
                System.out.println("The object is of an unknown type.");
            }
        }
    }


