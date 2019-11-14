package Action;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MySpring {
    public Object getModel(String className) {
        Class class1 = null;
        try {
            class1 = Class.forName("Model.LoginModel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请给" + className + "类的对象赋值");
        // 通过class创建一个对象
        Object obj = null;
        try {
            obj = class1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // 在这里做一个自动DI注入，对象中的所有属性值set
        // 找到每一个不同对象中的所有SET方法，给属性赋值
        // 自己通过拼接字符串的方式处理名字
        // 通过class类找寻类中的所有私有属性,获取每一个属性的名字
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields) {
            // 获取属性名
            String fieldName = field.getName();
            // 手动拼接，拼接属性对应的set方法名
            String fistLetter = fieldName.substring(0, 1).toUpperCase();// 属性首字母大写
            String otherLetter = fieldName.substring(1);// 属性处理首字母之外的其他的字母
            StringBuilder setMethodName = new StringBuilder("set");
            setMethodName.append(fistLetter);
            setMethodName.append(otherLetter);
            // 获取field对应的属性类型，找寻set方法时传递参数用
            Class fieldClass = field.getType();
            // 通过处理好的set方法名，找寻类中的set方法
            Method setMethod = null;
            try {
                setMethod = class1.getMethod(setMethodName.toString(), fieldClass);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            // 找到setMethod执行  属性就赋值成功了
            System.out.println("请给" + fieldName + "属性提供值");
            String value = input.nextLine();
            // 需要执行属性对应的set方法.给属性赋值 方法就结束
            // 属性的值现在接收过来，全都是string类型
            // 执行set方法的时候 方法需要的值不一定都是string类型 有可能为 integer和float
            // 如何将所有的string 类型的值转化成属性类的值
            // integer 包装类，八个包装类有7个带有STRING的构造方法
            // new Integer(String) new Float (String) new String(String)
            // 可以利用包装类带String 的构造方法处理  属性类型对应的带String参数的构造方法
            Constructor con = null;
            try {
                con = fieldClass.getConstructor(String.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            try {
                setMethod.invoke(obj, con.newInstance(value));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
        return obj;
    }
}

