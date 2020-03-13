package Exercise_while;

import java.util.Scanner;

public class testing_work {
    public static void main(String[] args) {
        String answer;	//标识检查是否合格
        Scanner input = new Scanner(System.in);
        System.out.print("合格了吗?(y/n)：");
        answer = input.next();
        while(!"y".equals(answer)){
            System.out.println("上午复习概念知识，理解概念！");
            System.out.println("下午训练案例，熟练掌握代码！\n");
            System.out.print("合格了吗?(y/n)：");
            answer = input.nextLine();
        }
        System.out.println("完成复习任务！");
    }
}
