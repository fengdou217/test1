package Action;

public class Class3 extends Class2 {
    public static void main(String[] args) {
        String s="abc";
        Class class3=null;
        try {
             class3=Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
