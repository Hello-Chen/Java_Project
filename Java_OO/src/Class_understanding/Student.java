package Class_understanding;

/**
 * @author HelloChen
 * @version 1.0
 * @date 2020/3/15 16:13
 */
/*
* 类的属性（是什么）
* 行为（做什么）
* 成员变量=属性
* 成员方法=行为
* 1.成员变量是直接定义在类当中的，在方法外面
* 2.成员方法不要写static关键字
* */
public class Student {
    //定义成员变量
    int age;
    String name;

    //定义成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }
}
