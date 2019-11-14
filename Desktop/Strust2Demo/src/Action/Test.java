package Action;

import Model.Question;

public class Test {
    public static void main(String[] args) {
        // 创建一个question对象，对象的控制权交给别人处理myspring
        MySpring spring =new MySpring();
        Question question=(Question)spring.getModel("Model.Question");

        System.out.println(question);
    }
}
