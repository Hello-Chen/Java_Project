package Exercise_array;
//给出一个成绩数组（数组任意给）求总成绩和平均成绩，最高分

import java.util.Random;

public class grade {
    public static void main(String[] args) {
        String[] course = new String[]{"语文: ", "数学: ", "Android: ", "JAVA: ", "体育: "};
        Random ran = new Random();  //生成随机数的方法
        double[] grade = new double[5];
        for (int i = 0; i < 5; i++) {
            grade[i] = ran.nextDouble() * 100;//生成一个0-100的随机数
        }
        for (int i = 0; i < grade.length; i++) { //保留两位小数输出
            System.out.println(course[i] + String.format("%.2f", grade[i]));
        }
        System.out.println("该同学成绩情况如下: ");
        calculate(grade); //计算总分，平均分，最大最小值的方法
    }

    private static void calculate(double[] grade) {
        double Max = grade[0], Min = grade[0], sum = grade[0];
        for (int i = 0; i < grade.length; i++) {
            if (Max < grade[i]) {
                Max = grade[i];
            }
            if (Min > grade[i]) {
                Min = grade[i];
            }
            sum += grade[i];
        }
        System.out.println("最高分: " + String.format("%.2f", Max) + "\n"
                + "最低分: " + String.format("%.2f", Min));
        System.out.println("总成绩: " + String.format("%.2f", sum) + "\n"
                + "平均分: " + String.format("%.2f", sum / grade.length));
    }
}
