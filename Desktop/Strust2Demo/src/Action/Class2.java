package Action;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Class2 extends Class1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class class2 = null;


        try {
            class2 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method[] methods1 = class2.getDeclaredMethods();

        for (Method method : methods1) {
            System.out.println(method);
        }
        int modifiers1 = class2.getModifiers(); // 获取类的修饰符
        String namea = class2.getName();  // 获取类全名
        String name2 = class2.getSimpleName(); // 获取简单类名
        Class<?> name3 = class2.getSuperclass(); // 获取父类
        Field[] nameFields = class2.getFields();
        System.out.println("类中的属性:" + nameFields.length);
//        Field namefield = class2.getField("name");
//
////        Field nameField = null;
//        int modifiers= namefield.getModifiers();
//        System.out.println("属性的修饰符："+modifiers);
//        System.out.println("属性的类型："+namefield.getType());
//        System.out.println("属性名："+namefield.getName());
//        // 为属性赋值
//                Person p=new Person();
//        try {
//            Person p1 = (Person) class2.newInstance();
//        } catch (InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        Field f=class2.getDeclaredField("name");
//        // 在用反射时访问私有变量
//        f.setAccessible(true);
////        String name=(String)namea.getField.get(p);
////        System.out.println(name);
//


//        Field f = null;//获取私有属性值
//        try {
//            f = class2.getDeclaredField("name");
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
////        getDeclaredFields//取得所有公有和私有的属性，但只能获取本类中的属性
//        System.out.println(f.getType());


        System.out.println("父类当前的接口" + Arrays.toString(class2.getInterfaces()));// 获取当前class的所有父接口
        System.out.println("name is" + namea + "name2 is" + name2 + "name3 is" + name3);
        System.out.println("类的修饰符" + modifiers1);
        System.out.println("类所在的包：" + class2.getPackage().getName());
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
