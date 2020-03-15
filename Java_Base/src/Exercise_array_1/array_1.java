package Exercise_array_1;
        /*for (String n:name) {            //foreach形式输出
            System.out.print(n+" ");
        }*/
        /*for (int i=0;i<=name.length-1;i++){

            System.out.println(name[i]);
        }*/

import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        String[] name = new String[]{"张三", "李四", "王五", "陈六", "蒋七", "王刚",
                "张红", "李华", "韩梅梅", "陈雷"};
        String a = new Scanner(System.in).nextLine();
        for (String n : name) {
            if (a.equals(n)) {
                System.out.println("在数组中");
            }
            else {
                System.out.println("不在数组中");
            }
            break;
        }
    }
}
