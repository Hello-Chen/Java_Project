package Class_understanding;

/**
 * @author HelloChen
 * @version 1.0
 * @date 2020/3/15 17:25
 */
/*
 * 类并不能直接使用，需要通过创建对象引用
 * 使用类一般分为三步：
 * 1.导包，通过import关键字导入外部包，类在同一目录下不需要导包
 * 2.创建，通过new关键字创建出类的实例，格式：类名 变量名 = new 类名;
 * 3.使用，使用类的属性和方法. 格式：类名.变量 or 类名.方法(参数);
 *
 * */
public class Use_student_class {
    public static void main(String[] args) {
        //创建Student类的对象 stu
        Student stu = new Student();
        System.out.println(stu.age);// 0
        System.out.println(stu.name);// null因为没有赋值，所有打印的默认值
        //给Student类的成员变量赋值
        stu.name = "ChenJinkun";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        //使用Student类下的方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
