package Action;

import java.lang.reflect.Method;
import java.util.Date;

public class Class1 {

    public static void main(String[] args) throws NoSuchFieldException {
        Date date = new Date();
        date.getYear();
        @Deprecated
        Class class1 = null;
        try {
            class1 = Class.forName("java.sql.Connection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method[] methods1 = class1.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        int modifiers = class1.getModifiers(); // 获取类的修饰符
        String name = class1.getName();  // 获取类全名
        String name2 = class1.getSimpleName(); // 获取简单类名
        System.out.println("name is" + name + "name2 is" + name2);
        System.out.println(modifiers);
        System.out.println("类所在的包：" + class1.getPackage().getName());
    }
}
