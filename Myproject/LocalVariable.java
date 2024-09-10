public class LocalVariable {
    public void dateAge() {
    int age = 0;
    age = age + 7;
    System.out.println("Perfect date age for a man is : " + age);
    }

public static void main(String args[]) {
    LocalVariable test = new LocalVariable();
    test.dateAge();
    }
}
